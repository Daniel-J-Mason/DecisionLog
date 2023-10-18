package com.allthing.application.port.outgoing.decision;

import com.allthing.application.domain.Decision;

public interface CreateDecisionPort {
    Decision create(Decision decision);
}
