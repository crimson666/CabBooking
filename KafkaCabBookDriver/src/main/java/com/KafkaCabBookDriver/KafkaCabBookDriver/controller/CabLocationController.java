package com.KafkaCabBookDriver.KafkaCabBookDriver.controller;

import com.KafkaCabBookDriver.KafkaCabBookDriver.serive.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CabLocationController {
    @Autowired
    CabLocationService cabLocationService = new CabLocationService();
    @PutMapping
    public ResponseEntity updateLocation(){
        int range =100;
        while(range > 0){
            System.out.println(Math.random() + "," + Math.random());
            range --;
        }
        return new ResponseEntity<>(Map.of("Message","Location Updated"), HttpStatus.OK);
    }
}

