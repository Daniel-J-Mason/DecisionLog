package com.allthing.application.dto.object.mapper;

import com.allthing.application.domain.Decision;
import com.allthing.application.dto.object.DecisionDto;

public interface DecisionDtoMapper {
    DecisionDto map(Decision decision);
    
    Decision map(DecisionDto decisionDto);
}
