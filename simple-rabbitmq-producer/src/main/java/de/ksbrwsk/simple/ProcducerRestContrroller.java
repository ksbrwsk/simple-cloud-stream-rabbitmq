package de.ksbrwsk.simple;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProcducerRestContrroller {

    private final MessageChannel consumer;

    public ProcducerRestContrroller(ProducerChannels channels) {
        this.consumer = channels.consumer();
    }

    @GetMapping("/producer/{text}")
    public String produce(@PathVariable String text) {
        log.info("producing message with payload: {}", text);
        Message<String> stringMessage = MessageBuilder
                .withPayload(text)
                .build();
        log.info("sending message : {}", stringMessage.getPayload());
        this.consumer.send(stringMessage);
        return "message send: " + stringMessage.getPayload();
    }
}
