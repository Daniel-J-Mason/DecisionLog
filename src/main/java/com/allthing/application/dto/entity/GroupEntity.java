package com.allthing.application.dto.entity;

import java.util.List;
import java.util.UUID;

public interface GroupEntity {
    UUID getId();
    
    String getName();
    
    List<? extends ProjectEntity> getProjectList();
}
