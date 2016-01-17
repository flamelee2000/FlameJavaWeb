package com.whoeveryou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.whoeveryou.model.Team;
import com.whoeveryou.repository.TeamRepository;

@Service("teamService")
public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamRepository teamRepository;
	
	@Transactional
	public Team save(Team team) {
		return teamRepository.save(team);
	}

	public List<Team> findALLTeams() {
		return teamRepository.findAll();
	}

}
