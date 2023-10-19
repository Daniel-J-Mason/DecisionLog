package com.allthing.adapters.config;

import com.allthing.adapters.persistence.entity.mapper.MybatisDecisionEntityMapper;
import com.allthing.adapters.persistence.entity.mapper.MybatisGroupEntityMapper;
import com.allthing.adapters.persistence.entity.mapper.MybatisProjectEntityMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceEntityMapperConfig {
    
    
    @Bean
    public MybatisDecisionEntityMapper mybatisDecisionEntityMapper(
            MybatisProjectEntityMapper mybatisProjectEntityMapper){
        return new MybatisDecisionEntityMapper(mybatisProjectEntityMapper);
    }
    
    
    @Bean
    public MybatisProjectEntityMapper mybatisProjectEntityMapper(
            MybatisDecisionEntityMapper mybatisDecisionEntityMapper,
            MybatisGroupEntityMapper mybatisGroupEntityMapper){
        return new MybatisProjectEntityMapper(mybatisDecisionEntityMapper, mybatisGroupEntityMapper);
    }
    
    @Bean
    public MybatisGroupEntityMapper mybatisGroupEntityMapper(
            MybatisProjectEntityMapper mybatisProjectEntityMapper){
        return new MybatisGroupEntityMapper(mybatisProjectEntityMapper);
    }
    
}
