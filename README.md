- Processor will fetch data from one topic performs it's logic and then send new/modified data to other topic.

```java
// Function<T1, T2> is actually a processor takes T1 type
// as input and gives output of T2 type.
// So. kafka binder functionality analyse it and creates 
// two topics automatically 
// <function_name>-in-0 --> input topic
// <function_name>-out-0 --> output topic

@Bean
public Function<String, String> processorBinding(){
    return S -> S + " :: " + System.currentTimeMillis();
}
```

- Supplier will continuously send data to topic

```java
@Bean
public Supplier<String> producerBinding(){
    return () -> {
        try {
            Thread.sleep(1500);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return "new data";
    };
}
```

- Consumer will fetch data from topic

```java
@Bean
public Consumer<String> consumerBinding(){
    return S -> System.out.println("Data Consumed :: " + S.toUpperCase());
}
```
    