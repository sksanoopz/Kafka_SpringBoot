package com.dailycodechallenge.kafka_consumer.component;

import org.apache.kafka.common.internals.Topic;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class KafkaComponent {

    @KafkaListener(topics="KFT",groupId = "group-id")
    public void listenMessage(String message)
    {
        System.out.println(message);
    }
}
