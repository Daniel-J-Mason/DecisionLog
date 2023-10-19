package com.allthing.application.port.outgoing.decision;

import com.allthing.application.domain.Decision;

public interface CreateDecisionPort {
    Long create(Decision decision);
}
