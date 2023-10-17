package com.allthing.application.dto.entity.mapper;

import com.allthing.application.domain.Group;
import com.allthing.application.dto.entity.GroupEntity;

public interface GroupEntityMapper<T extends GroupEntity> {
    Group map(GroupEntity groupEntity);
    
    T map(Group group);
}