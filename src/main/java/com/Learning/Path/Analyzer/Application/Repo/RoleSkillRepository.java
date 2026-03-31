package com.Learning.Path.Analyzer.Application.Repo;

import com.Learning.Path.Analyzer.Application.entity.RoleSkill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleSkillRepository extends JpaRepository<RoleSkill, Long> {
    List<RoleSkill> findByRoleNameOrderByOrderNumber(String roleName);
}