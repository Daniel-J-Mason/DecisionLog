package com.allthing.adapters.javafx.Dto;

import com.allthing.application.dto.object.GroupDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JavafxGroupDto implements GroupDto {
    
    private String name;
    private List<JavafxProjectDto> projectList;
}
