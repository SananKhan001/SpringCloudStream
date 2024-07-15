package com.spring.cloud.stream.SpringCloudStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.function.Function;


@RequestMapping
@RestController
public class BookController {
    @Autowired
    private StreamBridge streamBridge;

    @PostMapping("/send")
    public void send(@RequestBody Book book){
        streamBridge.send("in-of-cons", book);
    }

}
