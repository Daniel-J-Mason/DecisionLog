package com.allthing.adapters.persistence;

import com.allthing.adapters.persistence.entity.MybatisDecisionEntity;
import com.allthing.adapters.persistence.repository.MybatisDecisionRepository;
import com.allthing.application.domain.Decision;
import com.allthing.application.dto.entity.mapper.DecisionEntityMapper;
import com.allthing.application.port.outgoing.decision.CreateDecisionPort;
import com.allthing.application.port.outgoing.decision.DeleteDecisionByIdPort;
import com.allthing.application.port.outgoing.decision.UpdateDecisionPort;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class DecisionRepository implements CreateDecisionPort, UpdateDecisionPort, DeleteDecisionByIdPort {
    
    private final MybatisDecisionRepository mybatisDecisionRepository;
    private final DecisionEntityMapper<MybatisDecisionEntity> decisionEntityMapper;
    
    @Override
    public Decision create(Decision decision) {
        return decisionEntityMapper.map(mybatisDecisionRepository.create(decisionEntityMapper.map(decision)));
    }
    
    @Override
    public Long deleteById(UUID id) {
        return mybatisDecisionRepository.deleteById(id);
    }
    
    @Override
    public Decision update(Decision decision) {
        return decisionEntityMapper.map(mybatisDecisionRepository.update(decisionEntityMapper.map(decision)));
    }
}
