package com.allthing.application.dto.object.mapper;

import com.allthing.application.domain.Group;
import com.allthing.application.dto.object.GroupDto;

public interface GroupDtoMapper {
    GroupDto map(Group group);
}
