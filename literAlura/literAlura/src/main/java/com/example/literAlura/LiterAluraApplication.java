package com.example.literAlura;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LiterAluraApplication {
    public static void main(String[] args) {
        SpringApplication.run(LiterAluraApplication.class, args);
    }
}

