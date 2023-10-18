package com.allthing.adapters.persistence.entity.mapper;

import com.allthing.adapters.persistence.entity.MybatisDecisionEntity;
import com.allthing.adapters.persistence.entity.MybatisProjectEntity;
import com.allthing.application.domain.Decision;
import com.allthing.application.dto.entity.DecisionEntity;
import com.allthing.application.dto.entity.mapper.DecisionEntityMapper;
import com.allthing.application.dto.entity.mapper.ProjectEntityMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MybatisDecisionEntityMapper implements DecisionEntityMapper<MybatisDecisionEntity> {
    
    private final ProjectEntityMapper<MybatisProjectEntity> projectEntityMapper;
    
    @Override
    public Decision map(DecisionEntity decisionEntity) {
        return Decision.builder()
                .id(decisionEntity.getId())
                .approvedBy(decisionEntity.getApprovedBy())
                .category(decisionEntity.getCategory())
                .comments(decisionEntity.getComments())
                .decisionDate(decisionEntity.getDecisionDate())
                .details(decisionEntity.getDetails())
                .project(projectEntityMapper.map(decisionEntity.getProject()))
                .proposedBy(decisionEntity.getProposedBy())
                .responsibleParty(decisionEntity.getResponsibleParty())
                .status(decisionEntity.getStatus())
                .build();
    }
    
    @Override
    public MybatisDecisionEntity map(Decision decision) {
        return MybatisDecisionEntity.builder()
                .id(decision.getId())
                .approvedBy(decision.getApprovedBy())
                .category(decision.getCategory())
                .comments(decision.getComments())
                .decisionDate(decision.getDecisionDate())
                .details(decision.getDetails())
                .project(projectEntityMapper.map(decision.getProject()))
                .proposedBy(decision.getProposedBy())
                .responsibleParty(decision.getResponsibleParty())
                .status(decision.getStatus())
                .build();
    }
}
