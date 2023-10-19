package com.allthing.adapters.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    
    @Bean
    public DataSource getDataSource(DataSourceProperties dataSourceProperties){
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url(dataSourceProperties.getUrl());
        dataSourceBuilder.driverClassName(dataSourceProperties.getDriverClassName());
        return dataSourceBuilder.build();
    }
    
    @Configuration
    @ConfigurationProperties(prefix = "spring.datasource")
    @Data
    public static class DataSourceProperties{
        private String url;
        private String driverClassName;
    }
}
