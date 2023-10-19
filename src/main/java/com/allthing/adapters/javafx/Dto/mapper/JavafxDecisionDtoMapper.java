package com.allthing.adapters.javafx.Dto.mapper;

import com.allthing.adapters.javafx.Dto.JavafxDecisionDto;
import com.allthing.application.domain.Category;
import com.allthing.application.domain.Decision;
import com.allthing.application.domain.Status;
import com.allthing.application.dto.object.DecisionDto;
import com.allthing.application.dto.object.mapper.DecisionDtoMapper;

import java.util.Optional;
import java.util.UUID;

public class JavafxDecisionDtoMapper implements DecisionDtoMapper {
    @Override
    public DecisionDto map(Decision decision) {
        return JavafxDecisionDto.builder()
                .approvalDate(decision.getApprovalDate())
                .approvedBy(decision.getApprovedBy())
                .category(Optional.ofNullable(decision.getCategory())
                        .map(Category::name)
                        .orElse(Category.NA.name()))
                .comments(decision.getComments())
                .details(decision.getDetails())
                .number(decision.getNumber())
                .proposalDate(decision.getProposalDate())
                .proposedBy(decision.getProposedBy())
                .responsibleParty(decision.getResponsibleParty())
                .status(Optional.ofNullable(decision.getStatus())
                        .map(Status::name)
                        .orElse(Status.PENDING.name()))
                .build();
    }
    
    @Override
    public Decision map(DecisionDto decisionDto) {
        return Decision.builder()
                .id(UUID.randomUUID())
                .approvalDate(decisionDto.getApprovalDate())
                .approvedBy(decisionDto.getApprovedBy())
                .category(Category.valueOf(decisionDto.getCategory()))
                .comments(decisionDto.getComments())
                .details(decisionDto.getDetails())
                .number(decisionDto.getNumber())
                .proposalDate(decisionDto.getProposalDate())
                .proposedBy(decisionDto.getProposedBy())
                .responsibleParty(decisionDto.getResponsibleParty())
                .status(Status.valueOf(decisionDto.getStatus()))
                .build();
    }
}
