package com.allthing.application.port.incoming.decision;

import com.allthing.application.dto.object.DecisionDto;

public interface CreateDecisionUseCase {
    Long create(DecisionDto decisionDto);
}
