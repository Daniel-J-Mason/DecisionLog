package com.allthing.application.service;

import com.allthing.application.dto.object.DecisionDto;
import com.allthing.application.dto.object.mapper.DecisionDtoMapper;
import com.allthing.application.port.incoming.decision.CreateDecisionUseCase;
import com.allthing.application.port.incoming.decision.DeleteDecisionByIdUseCase;
import com.allthing.application.port.incoming.decision.UpdateDecisionUseCase;
import com.allthing.application.port.outgoing.decision.CreateDecisionPort;
import com.allthing.application.port.outgoing.decision.DeleteDecisionByIdPort;
import com.allthing.application.port.outgoing.decision.UpdateDecisionPort;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class DecisionService implements CreateDecisionUseCase, DeleteDecisionByIdUseCase, UpdateDecisionUseCase {
    private final CreateDecisionPort createDecisionPort;
    private final DeleteDecisionByIdPort deleteDecisionPort;
    private final UpdateDecisionPort updateDecisionByIdPort;
    private final DecisionDtoMapper decisionDtoMapper;
    
    @Override
    public DecisionDto create(DecisionDto decisionDto) {
        return decisionDtoMapper.map(createDecisionPort.create(decisionDtoMapper.map(decisionDto)));
    }
    
    @Override
    public Long deleteById(UUID id) {
        return deleteDecisionPort.deleteById(id);
    }
    
    @Override
    public DecisionDto update(DecisionDto decisionDto) {
        return decisionDtoMapper.map(updateDecisionByIdPort.update(decisionDtoMapper.map(decisionDto)));
    }
}
