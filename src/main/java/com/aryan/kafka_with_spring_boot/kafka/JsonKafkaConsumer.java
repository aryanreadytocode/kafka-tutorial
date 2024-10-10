package com.aryan.kafka_with_spring_boot.kafka;

import com.aryan.kafka_with_spring_boot.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "javaguides_json", groupId = "biharGroup")
    public void consume(User user) {
        LOGGER.info(String.format("Json message recieved -> %s", user.toString()));
    }
}
