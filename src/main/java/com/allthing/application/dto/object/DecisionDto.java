package com.allthing.application.dto.object;

import com.allthing.application.domain.Category;
import com.allthing.application.domain.Status;

import java.time.LocalDate;

public interface DecisionDto {
    String getApprovedBy();
    
    Category getCategory();
    
    String getComments();
    
    LocalDate getDecisionDate();
    
    String getDetails();
    
    String getProposedBy();
    
    String getResponsibleParty();
    
    Status getStatus();
    
    ProjectDto getProject();
}
