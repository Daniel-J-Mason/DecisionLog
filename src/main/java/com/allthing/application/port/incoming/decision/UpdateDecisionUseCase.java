package com.allthing.application.port.incoming.decision;

import com.allthing.application.dto.object.DecisionDto;

public interface UpdateDecisionUseCase {
    DecisionDto update(DecisionDto decisionDto);
}
