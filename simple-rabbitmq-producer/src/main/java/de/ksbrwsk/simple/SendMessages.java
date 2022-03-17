package de.ksbrwsk.simple;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
@RequiredArgsConstructor
@Slf4j
public class SendMessages {
    private AtomicLong counter = new AtomicLong(1L);

    private final MessageChannel consumer;

    @Scheduled(fixedRate = 2L)
    public void send() {
        Long count = counter.incrementAndGet();
        String text = "Message@"+count;
        log.info("producing message with payload: {}",text );
        Message<String> stringMessage = MessageBuilder
                .withPayload(text)
                .build();
        log.info("sending message : {}", stringMessage.getPayload());
        this.consumer.send(stringMessage);
    }
}
