package com.allthing.adapters.javafx.Dto;

import com.allthing.adapters.persistence.entity.MybatisProjectEntity;
import com.allthing.application.dto.object.DecisionDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JavafxDecisionDto implements DecisionDto {
    private LocalDate approvalDate;
    private String approvedBy;
    private String category;
    private String comments;
    private String details;
    private Long number;
    private LocalDate proposalDate;
    private String proposedBy;
    private String responsibleParty;
    private String status;
    private JavafxProjectDto project;
}
