package com.sac.order;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@Configuration
@EntityScan(basePackages = "com.sac.order.entity")
@ComponentScan(basePackages = {"com.sac.order", "com.sac.common"})
@EnableJpaRepositories(basePackages = "com.sac.order.repository")
@EnableAutoConfiguration
@EnableDiscoveryClient
public class OrderApp {


    public static void main(String[] args) {
        SpringApplication.run(OrderApp.class, args);
    }
}
