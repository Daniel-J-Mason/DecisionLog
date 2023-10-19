package com.allthing.adapters.javafx.controller;

import com.allthing.adapters.javafx.Dto.JavafxDecisionDto;
import com.allthing.application.service.DecisionService;
import javafx.event.ActionEvent;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LaunchPageController {
    
    private final DecisionService decisionService;
    
    public void runTest(ActionEvent actionEvent) {
        decisionService.create(JavafxDecisionDto.builder()
                        .number(1L)
                        .details("SomeNotes")
                        .build());
    }
}
