package com.Learning.Path.Analyzer.Application.Service;

import com.Learning.Path.Analyzer.Application.Repo.RoleSkillRepository;
import com.Learning.Path.Analyzer.Application.entity.RoleSkill;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
    public class LearningPathService{

        private final RoleSkillRepository roleSkillRepository;

        public LearningPathService(RoleSkillRepository roleSkillRepository) {
            this.roleSkillRepository = roleSkillRepository;
        }

        public List<String> getRecommendedSkills(String roleName, List<String> currentSkills) {
            // Fetch roadmap for the role
            List<RoleSkill> roadmap = roleSkillRepository.findByRoleNameOrderByOrderNumber(roleName);

            // Filter out skills the user already knows
            return roadmap.stream()
                    .map(rs -> rs.getSkill().getName())
                    .filter(skill -> !currentSkills.contains(skill))
                    .collect(Collectors.toList());
        }
    }
