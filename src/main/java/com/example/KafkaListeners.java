package com.example;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

        @KafkaListener(topics = "firstTopic", groupId = "first")
        void listener(String data){
            System.out.println("Listener received "+ data);
        }
}
