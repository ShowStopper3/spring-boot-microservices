package com.sac.common.config;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CommonConfig {

    @Bean
    public Mapper mapper() {
        Mapper mapper = new DozerBeanMapper();
        return mapper;
    }


}
