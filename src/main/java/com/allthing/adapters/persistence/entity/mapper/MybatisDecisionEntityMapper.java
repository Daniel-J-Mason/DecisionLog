package com.allthing.adapters.persistence.entity.mapper;

import com.allthing.adapters.persistence.entity.MybatisDecisionEntity;
import com.allthing.adapters.persistence.entity.MybatisProjectEntity;
import com.allthing.application.domain.Category;
import com.allthing.application.domain.Decision;
import com.allthing.application.domain.Status;
import com.allthing.application.dto.entity.DecisionEntity;
import com.allthing.application.dto.entity.mapper.DecisionEntityMapper;
import com.allthing.application.dto.entity.mapper.ProjectEntityMapper;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class MybatisDecisionEntityMapper implements DecisionEntityMapper<MybatisDecisionEntity> {
    
    @Override
    public Decision map(DecisionEntity decisionEntity) {
        return Decision.builder()
                .id(decisionEntity.getId())
                .approvalDate(decisionEntity.getApprovalDate())
                .approvedBy(decisionEntity.getApprovedBy())
                .category(Category.valueOf(decisionEntity.getCategory()))
                .comments(decisionEntity.getComments())
                .details(decisionEntity.getDetails())
                .number(decisionEntity.getNumber())
                .proposalDate(decisionEntity.getProposalDate())
                .proposedBy(decisionEntity.getProposedBy())
                .responsibleParty(decisionEntity.getResponsibleParty())
                .status(Status.valueOf(decisionEntity.getStatus()))
                .build();
    }
    
    @Override
    public MybatisDecisionEntity map(Decision decision) {
        return MybatisDecisionEntity.builder()
                .id(decision.getId())
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
}
