package com.allthing.adapters.javafx.Dto;

import com.allthing.adapters.persistence.entity.MybatisDecisionEntity;
import com.allthing.adapters.persistence.entity.MybatisGroupEntity;
import com.allthing.application.dto.object.ProjectDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JavafxProjectDto implements ProjectDto {
    private LocalDateTime dateCreated;
    private List<JavafxDecisionDto> decisionList;
    private LocalDateTime lastEdited;
    private String name;
    private String urlReference;
    private JavafxGroupDto group;
}
