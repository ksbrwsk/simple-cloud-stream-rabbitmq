package de.ksbrwsk.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface ConsumerChannels {

    @Input
    MessageChannel producer();
}
