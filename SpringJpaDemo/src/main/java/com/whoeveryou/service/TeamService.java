package com.whoeveryou.service;

import java.util.List;

import com.whoeveryou.model.Team;

public interface TeamService {

	Team save(Team team);
	List<Team> findALLTeams();
}
