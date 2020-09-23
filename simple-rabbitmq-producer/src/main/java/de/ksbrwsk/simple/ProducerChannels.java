package de.ksbrwsk.simple;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ProducerChannels {

    @Output
    MessageChannel consumer();
}
