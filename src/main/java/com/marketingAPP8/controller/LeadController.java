package com.marketingAPP8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingAPP8.dtos.LeadData;
import com.marketingAPP8.entities.Lead;
import com.marketingAPP8.services.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
@RequestMapping("/createlead")
public String viewLeadPage() {
	return "create_lead";
}

@RequestMapping("/savelead")
public String saveOneLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
	leadService.saveLead(lead);
	model.addAttribute("msg","Lead is saved");
	return "create_lead";
}

@RequestMapping("/listall")
public String listLeads(ModelMap model) {
	List<Lead> leads = leadService.listOfLeads();
	model.addAttribute("lead",leads);
	return "search_lead";
}

@RequestMapping("/delete")
public String deleteOneLead(@RequestParam("id") long id,ModelMap model) {
	leadService.deleteLeadById(id);
	List<Lead> leads = leadService.listOfLeads();
	model.addAttribute("lead",leads);
	return "search_lead";
}

@RequestMapping("/update")
public String updateOneLead(@RequestParam("id") long id,ModelMap model) {
	Lead leads = leadService.getOneLead(id);
	model.addAttribute("lead",leads);
	return "update_lead";
}

@RequestMapping("/updatelead")
public String updateLeadData(LeadData data,ModelMap model) {
	Lead l=new Lead();
	l.setId(data.getId());
	l.setFirstName(data.getFirstName());
	l.setLastName(data.getLastName());
	l.setEmail(data.getEmail());
	l.setMobile(data.getMobile());
	leadService.saveLead(l);
	List<Lead> leads = leadService.listOfLeads();
	model.addAttribute("lead",leads);
	return "search_lead";
	
}
}
