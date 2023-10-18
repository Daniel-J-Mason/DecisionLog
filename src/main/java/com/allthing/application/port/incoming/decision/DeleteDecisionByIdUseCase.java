package com.allthing.application.port.incoming.decision;

import java.util.UUID;

public interface DeleteDecisionByIdUseCase {
    Long deleteById(UUID id);
}
