package com.Learning.Path.Analyzer.Application.Repo;

import com.Learning.Path.Analyzer.Application.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}