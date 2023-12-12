package com.example.kafkastreampractice.Consumer;

import com.example.kafkastreampractice.Entity.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerMessage {


    private final Logger LOG = LoggerFactory.getLogger(KafkaConsumerMessage.class);

    @KafkaListener(topics = "order-buy-topic", groupId = "order-buy-group")
    public void listeningDecrease(Order order) {
        System.out.println(order.getId().toString());
       //do tomorrow
    }


}
