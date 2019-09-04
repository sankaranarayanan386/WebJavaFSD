package com.example.web.demoJavaFSD.utils;

import com.example.web.demoJavaFSD.DTO.SkillDto;
import com.example.web.demoJavaFSD.Entity.Skill;

public class SkillConverter {
	 public static Skill dtoToEntity(SkillDto SkillDto) {
	  Skill Skill = new Skill(SkillDto.getSkillName(), null);
	  Skill.setSkillId(SkillDto.getSkillId());
	  return Skill;
	 }
	 public static SkillDto entityToDto(Skill skill) {
	  return new SkillDto(skill.getSkillId(), skill.getSkillName());
	 }
	}s
