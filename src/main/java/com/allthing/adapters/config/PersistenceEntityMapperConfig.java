package com.allthing.adapters.config;

import com.allthing.adapters.persistence.entity.mapper.MybatisDecisionEntityMapper;
import com.allthing.adapters.persistence.entity.mapper.MybatisGroupEntityMapper;
import com.allthing.adapters.persistence.entity.mapper.MybatisProjectEntityMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceEntityMapperConfig {
    
    
    @Bean
    public MybatisDecisionEntityMapper mybatisDecisionEntityMapper(){
        return new MybatisDecisionEntityMapper();
    }
    
    
    @Bean
    public MybatisProjectEntityMapper mybatisProjectEntityMapper(
            MybatisDecisionEntityMapper mybatisDecisionEntityMapper){
        return new MybatisProjectEntityMapper(mybatisDecisionEntityMapper);
    }
    
    @Bean
    public MybatisGroupEntityMapper mybatisGroupEntityMapper(
            MybatisProjectEntityMapper mybatisProjectEntityMapper){
        return new MybatisGroupEntityMapper(mybatisProjectEntityMapper);
    }
    
}
