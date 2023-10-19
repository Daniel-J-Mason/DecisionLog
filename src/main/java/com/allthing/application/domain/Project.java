package com.allthing.application.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
public class Project {
    private UUID id;
    private LocalDateTime dateCreated;
    private List<Decision> decisionList;
    private LocalDateTime lastEdited;
    private String name;
    private String urlReference;
}
