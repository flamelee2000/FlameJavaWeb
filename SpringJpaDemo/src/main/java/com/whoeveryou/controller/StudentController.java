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

import com.whoeveryou.model.Student;
import com.whoeveryou.model.Team;
import com.whoeveryou.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/addStudent", method = RequestMethod.GET)
	public String addStudent(@ModelAttribute("student") Student student) {

		return "addStudent";
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addMoreStudent(@ModelAttribute("student") Student student,
			HttpSession session, BindingResult result) {
		System.out.println("name: " + student.getName());

		if (result.hasErrors()) {
			return "addStudent";
		} else {
			 Team team = (Team)session.getAttribute("team");
			 student.setTeam(team);
			studentService.save(student);
		}

		return "addStudent";
	}

	@RequestMapping(value = "/listStudents", method = RequestMethod.GET)
	public String listStudents(Model model) {
		List<Student> students = studentService.findALLStudents();
		model.addAttribute("students", students);
		return "listStudents";
	}

}
