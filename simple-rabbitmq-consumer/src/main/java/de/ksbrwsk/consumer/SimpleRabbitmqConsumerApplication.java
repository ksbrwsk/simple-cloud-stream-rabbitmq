package de.ksbrwsk.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(ConsumerChannels.class)
public class SimpleRabbitmqConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleRabbitmqConsumerApplication.class, args);
    }

}
