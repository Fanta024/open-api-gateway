package com.fanta.fantagateway;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class FantaGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(FantaGatewayApplication.class, args);
    }

}
