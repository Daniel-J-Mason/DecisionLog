package com.allthing.application.dto.entity;

import com.allthing.application.domain.Status;

import java.time.LocalDate;
import java.util.UUID;

public interface DecisionEntity {
    UUID getId();
    
    LocalDate getApprovalDate();
    
    String getApprovedBy();
    
    String getCategory();
    
    String getComments();
    
    String getDetails();
    
    Long getNumber();
    
    LocalDate getProposalDate();
    
    String getProposedBy();
    
    String getResponsibleParty();
    
    String getStatus();
    
    ProjectEntity getProject();
}
