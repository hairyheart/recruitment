package it.recruitment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.recruitment.dao.SkillDaoInterface;
import it.recruitment.dao.entity.Skill;

@Service
public class SkillService implements SkillServiceInterface {
	
		@Autowired
		private SkillDaoInterface skillDao;
		
		@Transactional
		public Skill findSkill(String descrizione) {
			return skillDao.findSkill(descrizione);
		}

		@Transactional
		public List<Skill> getAllSkill() {
			return skillDao.getAllSkill();
		}
	}

