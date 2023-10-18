package com.allthing.adapters.persistence.entity;

import com.allthing.application.domain.Decision;
import com.allthing.application.domain.Group;
import com.allthing.application.dto.entity.DecisionEntity;
import com.allthing.application.dto.entity.GroupEntity;
import com.allthing.application.dto.entity.ProjectEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MybatisProjectEntity implements ProjectEntity {
    private UUID id;
    private LocalDateTime dateCreated;
    private List<MybatisDecisionEntity> decisionList;
    private LocalDateTime lastEdited;
    private String name;
    private String urlReference;
    private MybatisGroupEntity group;
}
