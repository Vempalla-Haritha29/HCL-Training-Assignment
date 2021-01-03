package org.hcl.controllers;

import java.util.List;

import org.hcl.entities.Application;
import org.hcl.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ApplicationController {
	private ApplicationService applicationService;
	@Autowired
	public ApplicationController(ApplicationService applicationService) {
		super();
		this.applicationService = applicationService;
	}
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	@GetMapping("/display")
    public String displayDetails(Model model) {
		List<Application> applications=applicationService.getapplications();
		model.addAttribute("applications",applications);
       return  "home";
	}
}
