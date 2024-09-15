package com.KafkaCabBookDriver.KafkaCabBookDriver.serive;

import com.KafkaCabBookDriver.KafkaCabBookDriver.contant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {
    @Autowired
    private KafkaTemplate<String , Object> kafkaTemplate;

    public boolean sendDataToTopic(String Data){
        if(Data != null) {
            kafkaTemplate.send(AppConstant.CAB_LOCATION, Data);
        }
        return true;
    }
}
