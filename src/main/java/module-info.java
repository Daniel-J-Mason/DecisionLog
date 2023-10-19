module com.allthing {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires org.mybatis.spring;
    requires org.mybatis;
    requires java.sql;
    requires spring.context;
    requires spring.boot;
    requires org.mybatis.spring.boot.autoconfigure;
    requires liquibase.core;
    
    requires spring.beans;
    requires spring.boot.autoconfigure;
    requires spring.jdbc;
    requires spring.tx;
    requires spring.core;
    
    exports com.allthing.adapters.javafx.controller;
    exports com.allthing.application.service;
}