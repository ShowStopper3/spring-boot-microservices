package com.sac.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@Configuration
@EntityScan(basePackages = "com.sac.customer.entity")
@ComponentScan(basePackages = {"com.sac.customer", "com.sac.common"})
@EnableJpaRepositories(basePackages = "com.sac.customer.repository")
@EnableDiscoveryClient
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}
