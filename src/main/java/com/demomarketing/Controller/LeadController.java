package com.demomarketing.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demomarketing.Entity.Lead;
import com.demomarketing.Services.SaveOneLead;


@Controller
public class LeadController {
	
	@Autowired
	private SaveOneLead leadservice;
	
	//Handler method
	//http://localhost:8080/create
	@RequestMapping("/create")
	public String saveLeadAllRegistration() {
		return"Create_Lead";
	}
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead")Lead lead) {
		leadservice.saveOneLead(lead);
	return"Create_Lead";
	
	}

}
