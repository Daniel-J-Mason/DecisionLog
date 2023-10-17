package com.allthing.application.dto.object.mapper;

import com.allthing.application.domain.Project;
import com.allthing.application.dto.object.ProjectDto;

public interface ProjectDtoMapper {
    ProjectDto map(Project project);
}
