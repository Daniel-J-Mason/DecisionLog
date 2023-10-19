package com.allthing.adapters.javafx.controller;

import com.allthing.adapters.javafx.Dto.JavafxDecisionDto;
import com.allthing.application.service.DecisionService;
import javafx.event.ActionEvent;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
public class LaunchPageController {
    
    private final DecisionService decisionService;
    
    public void runTest(ActionEvent actionEvent) {
        decisionService.create(JavafxDecisionDto.builder()
                        .number(1L)
                        .details("SomeNotes")
                        .category("PROCESS")
                        .details("details")
                        .responsibleParty("Me")
                        .proposalDate(LocalDate.now())
                        .proposedBy("Me")
                        .status("APPROVED")
                        .approvalDate(LocalDate.now())
                        .comments("Comments")
                        .build());
    }
}
