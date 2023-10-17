package com.allthing.application.dto.entity;

import com.allthing.application.domain.Category;
import com.allthing.application.domain.Status;

import java.time.LocalDate;
import java.util.UUID;

public interface DecisionEntity {
    UUID getId();
    
    String getApprovedBy();
    
    Category getCategory();
    
    String getComments();
    
    LocalDate getDecisionDate();
    
    String getDetails();
    
    String getProposedBy();
    
    String getResponsibleParty();
    
    Status getStatus();
    
    ProjectEntity getProject();
}
