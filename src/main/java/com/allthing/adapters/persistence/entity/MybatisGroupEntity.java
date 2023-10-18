package com.allthing.adapters.persistence.entity;

import com.allthing.application.domain.Project;
import com.allthing.application.dto.entity.GroupEntity;
import com.allthing.application.dto.entity.ProjectEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MybatisGroupEntity implements GroupEntity {
    private UUID id;
    private String name;
    private List<MybatisProjectEntity> projectList;
}
