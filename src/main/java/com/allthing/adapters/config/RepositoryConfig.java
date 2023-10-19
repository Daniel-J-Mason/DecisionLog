package com.allthing.adapters.config;

import com.allthing.adapters.persistence.DecisionRepository;
import com.allthing.adapters.persistence.entity.mapper.MybatisDecisionEntityMapper;
import com.allthing.adapters.persistence.repository.MybatisDecisionRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {
    
    @Bean
    public DecisionRepository decisionRepository(
            MybatisDecisionRepository mybatisDecisionRepository,
            MybatisDecisionEntityMapper mybatisDecisionEntityMapper){
        return new DecisionRepository(mybatisDecisionRepository, mybatisDecisionEntityMapper);
    }
}
