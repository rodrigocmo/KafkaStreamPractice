package com.example.kafkastreampractice.Producer;
import com.example.kafkastreampractice.Entity.Order;
import com.example.kafkastreampractice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class KafkaProducerMessage {

    @Autowired
    private KafkaTemplate<String, Message<Order>> kafkaTemplate;

    @Autowired
    OrderService orderService;

    private final String INCREASE_TOPIC = "order-buy-topic";


    public void buyOrderList(){
        buyOrderListSend(orderService.orderBuySupplier().get());
    }

    public void buyOrderListSend(Message<Order> buyOrder ){
        kafkaTemplate.send(INCREASE_TOPIC, buyOrder);
    }




}
