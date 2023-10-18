package com.allthing.adapters.persistence.entity;

import com.allthing.application.domain.Category;
import com.allthing.application.domain.Status;
import com.allthing.application.dto.entity.DecisionEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MybatisDecisionEntity implements DecisionEntity {
    private UUID id;
    private String approvedBy;
    private Category category;
    private String comments;
    private LocalDate decisionDate;
    private String details;
    private String proposedBy;
    private String responsibleParty;
    private Status status;
    private MybatisProjectEntity project;
}
