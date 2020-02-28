package com.sac.authserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
@EnableDiscoveryClient
public class AuthApplication {


    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }


}
