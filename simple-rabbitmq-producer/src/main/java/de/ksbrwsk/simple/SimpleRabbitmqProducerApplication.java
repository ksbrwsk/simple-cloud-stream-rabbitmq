package de.ksbrwsk.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(ProducerChannels.class)
public class SimpleRabbitmqProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleRabbitmqProducerApplication.class, args);
    }

}
