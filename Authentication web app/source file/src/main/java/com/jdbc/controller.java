package com.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {

	@Autowired
	private repo repo;

	database stu = new database();

	@GetMapping("/")
	public String home(Model model) {
		entity udata = new entity();
		System.out.println(udata);
		model.addAttribute("user", udata);

		return "index";
	}

	@PostMapping("/submit")
	public String submit(@ModelAttribute entity udata) {

		database.createDatabase();
		System.out.println(udata);
		repo.save(udata);

		return "done";
	}

}
