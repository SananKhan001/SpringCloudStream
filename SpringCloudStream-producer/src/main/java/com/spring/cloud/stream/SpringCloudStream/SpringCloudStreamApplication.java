package com.spring.cloud.stream.SpringCloudStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


@SpringBootApplication
public class SpringCloudStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamApplication.class, args);
	}

//	@Bean
//	public Function<String, String> processorBinding(){
//		return S -> S + " :: " + System.currentTimeMillis();
//	}
//
//	@Bean
//	public Consumer<String> consumerBinding(){
//		return S -> System.out.println("Data Consumed :: " + S);
//	}
//
//	@Bean
//	public Supplier<String> producerBinding(){
//		return () -> {
//			try {
//				Thread.sleep(1500);
//			}
//			catch (InterruptedException e){
//				throw new RuntimeException(e);
//			}
//			return "new data";
//		};
//	}

}
