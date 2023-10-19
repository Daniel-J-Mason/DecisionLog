package com.allthing.application.dto.object;

import java.util.List;
import java.util.UUID;

public interface GroupDto {
    String getName();
    
    List<? extends ProjectDto> getProjectList();
}
