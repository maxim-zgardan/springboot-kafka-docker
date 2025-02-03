package com.example.kafka.springbootkafkadocker;

import com.example.kafka.springbootkafkadocker.utils.LogExecutionTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "test_topic",groupId = "group_id")
    @LogExecutionTime
    public void consumeMessage(String message){

        logger.info("Received - {}", message);
    }
}
