package com.spring.cloud.stream.SpringCloudStream_consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Function;

@RestController
@RequestMapping("/send")
public class BookController {
    @Autowired
    private StreamBridge streamBridge;

    @PostMapping
    public void send(@RequestBody Book book){
        streamBridge.send("in-of-prod", book);
    }
}
