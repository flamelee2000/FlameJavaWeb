package com.whoeveryou.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.whoeveryou.model.Team;
import com.whoeveryou.service.TeamService;

@Controller
@SessionAttributes("team")
public class TeamController {
	
	@Autowired
	private TeamService teamService;
	
	@RequestMapping(value = "/addTeam", method = RequestMethod.GET)
	public String addTeam(Model model, HttpSession session) {

		Team team = (Team) session.getAttribute("team");
		if (team == null) {
			team = new Team();
		}
		model.addAttribute("team", team);
		return "addTeam";
	}
	
	@RequestMapping(value = "/addTeam", method = RequestMethod.POST)
	public String updateTeam(@ModelAttribute("team") Team team,
			BindingResult result) {
		if (result.hasErrors()) {
			return "addTeam";
		} else {
			teamService.save(team);
		}
		return "redirect:addStudent.html";
	}
	
	@RequestMapping(value = "listTeams", method = RequestMethod.GET)
	public String getTeams(Model model) {
		List<Team> teams = teamService.findALLTeams();
		model.addAttribute("teams", teams);
		return "listTeams";
	}

}
