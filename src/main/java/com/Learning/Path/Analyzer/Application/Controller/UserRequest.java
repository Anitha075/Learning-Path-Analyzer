package com.Learning.Path.Analyzer.Application.Controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class UserRequest {
    private String goal;
    private List<String> currentSkills;
}
