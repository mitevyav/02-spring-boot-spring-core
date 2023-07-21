package com.yavor.springcoredemo.config;

import com.yavor.springcoredemo.common.Coach;
import com.yavor.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
