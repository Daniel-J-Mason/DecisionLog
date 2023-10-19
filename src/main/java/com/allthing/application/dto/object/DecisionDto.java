package com.allthing.application.dto.object;

import com.allthing.application.domain.Category;
import com.allthing.application.domain.Status;

import java.time.LocalDate;

public interface DecisionDto {
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
    
    ProjectDto getProject();
}
