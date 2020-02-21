package com.example.eurekasever10100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaSever10100Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSever10100Application.class, args);
    }

}
