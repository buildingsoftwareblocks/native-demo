package com.example.nativedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableConfigServer
@SpringBootApplication
public class NativeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NativeDemoApplication.class, args);
    }

}
