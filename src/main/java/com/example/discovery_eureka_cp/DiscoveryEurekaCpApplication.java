package com.example.discovery_eureka_cp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryEurekaCpApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryEurekaCpApplication.class, args);
    }
}
