package com.KafkaCabBookCutomer.KafkaCabBookCutomer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    @KafkaListener(topics = "cab-location",groupId = "user-group1")
    public void cabLocation(String Location){
        System.out.println(Location);
    }
}
