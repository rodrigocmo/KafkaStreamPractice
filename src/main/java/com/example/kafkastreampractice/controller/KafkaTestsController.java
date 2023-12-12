package com.example.kafkastreampractice.controller;

import com.example.kafkastreampractice.Producer.KafkaProducerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/kafka")
public class KafkaTestsController {

    @Autowired
    KafkaProducerMessage producerMessage;

    @GetMapping
    public void testKafka(){
        producerMessage.buyOrderList();
    }
}
