package de.ksbrwsk.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;

@Configuration
@Slf4j
public class ConsumerConfiguration {

    @Bean
    public IntegrationFlow integrationFlow(ConsumerChannels consumerChannels) {
        return IntegrationFlows
                .from(consumerChannels.producer())
                .handle(String.class, (payload, headers) -> {
                    log.info("new message consumed: {}", payload);
                    return null;
                })
                .get();
    }
}
