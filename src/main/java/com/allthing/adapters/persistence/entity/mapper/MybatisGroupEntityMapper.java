package com.allthing.adapters.persistence.entity.mapper;

import com.allthing.adapters.persistence.entity.MybatisGroupEntity;
import com.allthing.adapters.persistence.entity.MybatisProjectEntity;
import com.allthing.application.domain.Group;
import com.allthing.application.dto.entity.GroupEntity;
import com.allthing.application.dto.entity.mapper.GroupEntityMapper;
import com.allthing.application.dto.entity.mapper.ProjectEntityMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MybatisGroupEntityMapper implements GroupEntityMapper<MybatisGroupEntity> {
    
    private final ProjectEntityMapper<MybatisProjectEntity> projectEntityMapper;
    
    @Override
    public Group map(GroupEntity groupEntity) {
        return Group.builder()
                .id(groupEntity.getId())
                .name(groupEntity.getName())
                .projectList(groupEntity.getProjectList().stream().map(projectEntityMapper::map).toList())
                .build();
    }
    
    @Override
    public MybatisGroupEntity map(Group group) {
        return MybatisGroupEntity.builder()
                .id(group.getId())
                .name(group.getName())
                .projectList(group.getProjectList().stream().map(projectEntityMapper::map).toList())
                .build();
    }
}

