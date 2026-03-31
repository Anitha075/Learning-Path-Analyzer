package com.Learning.Path.Analyzer.Application.Controller;

import com.Learning.Path.Analyzer.Application.Service.LearningPathService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/learning-path")
public class LearningPathController {

    public  LearningPathService learningPathService;

    public LearningPathController(LearningPathService learningPathService) {
        this.learningPathService=learningPathService;
    }

    @PostMapping
    public List<String>  getLearningPath(@RequestBody UserRequest request)
    {
        return learningPathService.getRecommendedSkills(request.getGoal(),request.getCurrentSkills());
    }
}

