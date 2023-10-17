package com.allthing.application.dto.entity.mapper;

import com.allthing.application.domain.Decision;
import com.allthing.application.dto.entity.DecisionEntity;

public interface DecisionEntityMapper<T extends DecisionEntity> {
    Decision map(DecisionEntity decisionEntity);
    
    T map(Decision decision);
}