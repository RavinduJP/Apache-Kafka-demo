package com.example.car_book_user.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "car-location", groupId = "user-group")
    public void carLocation(String location) {
        System.out.println(location);
    }
}
