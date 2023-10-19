package com.allthing.adapters.persistence.entity.mapper;

import com.allthing.adapters.persistence.entity.MybatisDecisionEntity;
import com.allthing.adapters.persistence.entity.MybatisGroupEntity;
import com.allthing.adapters.persistence.entity.MybatisProjectEntity;
import com.allthing.application.domain.Project;
import com.allthing.application.dto.entity.ProjectEntity;
import com.allthing.application.dto.entity.mapper.DecisionEntityMapper;
import com.allthing.application.dto.entity.mapper.ProjectEntityMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MybatisProjectEntityMapper implements ProjectEntityMapper<MybatisProjectEntity> {
    
    private final DecisionEntityMapper<MybatisDecisionEntity> decisionEntityMapper;
    
    @Override
    public Project map(ProjectEntity projectEntity) {
        return Project.builder()
                .id(projectEntity.getId())
                .dateCreated(projectEntity.getDateCreated())
                .decisionList(projectEntity.getDecisionList().stream().map(decisionEntityMapper::map).toList())
                .lastEdited(projectEntity.getLastEdited())
                .name(projectEntity.getName())
                .urlReference(projectEntity.getUrlReference())
                .build();
    }
    
    @Override
    public MybatisProjectEntity map(Project project) {
        return MybatisProjectEntity.builder()
                .id(project.getId())
                .dateCreated(project.getDateCreated())
                .decisionList(project.getDecisionList().stream().map(decisionEntityMapper::map).toList())
                .lastEdited(project.getLastEdited())
                .name(project.getName())
                .urlReference(project.getUrlReference())
                .build();
    }
}
