package com.allthing.application.dto.entity.mapper;

import com.allthing.application.domain.Project;
import com.allthing.application.dto.entity.ProjectEntity;

public interface ProjectEntityMapper<T extends ProjectEntity> {
    Project map(ProjectEntity projectEntity);
    
    T map(Project project);
}