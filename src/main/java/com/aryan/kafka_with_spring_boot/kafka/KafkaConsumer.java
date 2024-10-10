package com.aryan.kafka_with_spring_boot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "javaguides", groupId = "biharGroup")
    public void consume(String message) {
        LOGGER.info(String.format("Message received -> %s", message));
    }
}
