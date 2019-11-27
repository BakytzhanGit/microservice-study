package com.bakytzhan.microservice_tutoral;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceTutoralApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceTutoralApplication.class, args);
    }

}
