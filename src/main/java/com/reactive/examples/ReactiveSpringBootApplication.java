package com.reactive.examples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ReactiveSpringBootApplication {

    @Value("${client.url}")
    private String url;
    public static void main(String[] args){
       SpringApplication.run(ReactiveSpringBootApplication.class,args);
    }

    @Bean
    WebClient getClient(){
        return WebClient.create(url);
    }
}
