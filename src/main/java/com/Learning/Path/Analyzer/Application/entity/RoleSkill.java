package com.Learning.Path.Analyzer.Application.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "role_id") //many skills can have same role id  MANY rows → ONE role
    private Role role;

    @ManyToOne
    @JoinColumn(name = "skill_id")//many roadmap entries can use the same skill  MANY rows → ONE skill
    private Skill skill;

    private int orderNumber;
}