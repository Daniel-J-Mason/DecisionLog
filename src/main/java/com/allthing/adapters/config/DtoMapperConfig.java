package com.allthing.adapters.config;

import com.allthing.adapters.javafx.Dto.mapper.JavafxDecisionDtoMapper;
import com.allthing.application.dto.object.mapper.DecisionDtoMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DtoMapperConfig {
    
    @Bean
    JavafxDecisionDtoMapper javafxDecisionDtoMapper(){
        return new JavafxDecisionDtoMapper();
    }
}
