package com.allthing.application.port.outgoing.decision;

import java.util.UUID;

public interface DeleteDecisionByIdPort {
    Long deleteById(UUID id);
}
