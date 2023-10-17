package com.allthing.application.dto.object;

import java.util.List;
import java.util.UUID;

public interface GroupDto {
    UUID getId();
    
    String getName();
    
    List<ProjectDto> getProjectList();
}
