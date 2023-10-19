package com.allthing.adapters.config;

import com.allthing.adapters.javafx.controller.LaunchPageController;
import com.allthing.application.service.DecisionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {
    
    @Bean
    LaunchPageController launchPageController(DecisionService decisionService){
        return new LaunchPageController(decisionService);
    }
}
