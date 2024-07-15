package com.spring.cloud.stream.SpringCloudStream_consumer;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Book {
    private int id;
    private String name;
}
