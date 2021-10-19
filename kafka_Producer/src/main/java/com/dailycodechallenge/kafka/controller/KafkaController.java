package com.dailycodechallenge.kafka.controller;

import com.dailycodechallenge.kafka.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class KafkaController {

    @Autowired
    KafkaTemplate<String, Student> kafkaTemplate;
    private static final String TOPIC_NAME = "KFT";

    @PostMapping("/publish/")
    public String getMessage(@RequestBody Student student)
    {
        kafkaTemplate.send(TOPIC_NAME,student);
        return "Sucessfully Posted !!";
    }


}
