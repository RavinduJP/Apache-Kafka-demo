package com.example.car_book_driver.service;

import com.example.car_book_driver.constant.AppConstant;
import org.springframework.kafka.core.KafkaTemplate;

public class CarLocationService {

    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean upadteLoction(String location) {
        kafkaTemplate.send(AppConstant.CAR_LOCATION, location);
        return true;
    }
}
