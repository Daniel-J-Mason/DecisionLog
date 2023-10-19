package com.allthing.adapters.config;

import com.allthing.application.dto.object.mapper.DecisionDtoMapper;
import com.allthing.application.port.outgoing.decision.CreateDecisionPort;
import com.allthing.application.port.outgoing.decision.DeleteDecisionByIdPort;
import com.allthing.application.port.outgoing.decision.UpdateDecisionPort;
import com.allthing.application.service.DecisionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    
    @Bean
    DecisionService decisionService(
            CreateDecisionPort createDecisionPort,
            DeleteDecisionByIdPort deleteDecisionByIdPort,
            UpdateDecisionPort updateDecisionPort,
            DecisionDtoMapper decisionDtoMapper){
        return new DecisionService(createDecisionPort, deleteDecisionByIdPort, updateDecisionPort, decisionDtoMapper);
    }
}
