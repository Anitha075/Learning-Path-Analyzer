package com.Learning.Path.Analyzer.Application.Repo;

import com.Learning.Path.Analyzer.Application.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}