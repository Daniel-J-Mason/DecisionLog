package com.allthing.application.dto.entity;

import com.allthing.application.domain.Decision;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public interface ProjectEntity {
    UUID getId();
    
    LocalDateTime getDateCreated();
    
    List<Decision> getDecisionList();
    
    LocalDateTime getLastEdited();
    
    String getName();
    
    String getUrlReference();
    
    GroupEntity getGroup();
}
