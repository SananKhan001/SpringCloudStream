package com.spring.cloud.stream.SpringCloudStream_consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Function;

@Configuration
public class KafkaConfig {
    @Bean
    public Function<Book, Book> processorBinding(){
        return S -> {
            System.out.println("Received in Processor of Consumer : " + S.toString());
            return S;
        };
    }

    @Bean
    public Consumer<Book> consumerBinding(){
        return S -> System.out.println("Data Consumed in Consumer : " + S);
    }
}
