package com.allthing.application.dto.object;

import com.allthing.application.domain.Decision;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public interface ProjectDto {
    LocalDateTime getDateCreated();
    
    List<? extends DecisionDto> getDecisionList();
    
    LocalDateTime getLastEdited();
    
    String getName();
    
    String getUrlReference();
    
    GroupDto getGroup();
}
