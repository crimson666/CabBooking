package com.KafkaCabBookDriver.KafkaCabBookDriver.serive;

import com.KafkaCabBookDriver.KafkaCabBookDriver.contant.AppConstant;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {
    private KafkaTemplate<String , Object> kafkaTemplate;

    public boolean sendDataToTopic(String Data){
        kafkaTemplate.send(AppConstant.CAB_LOCATION,Data);
        return true;
    }
}
