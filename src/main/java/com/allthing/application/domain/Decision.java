package com.allthing.application.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
public class Decision {
    private UUID id;
    private String approvedBy;
    private Category category;
    private String comments;
    private LocalDate decisionDate;
    private String details;
    private String proposedBy;
    private String responsibleParty;
    private Status status;
    
    private Project project; //TODO: determine whether uni or bi-directional is best
}
