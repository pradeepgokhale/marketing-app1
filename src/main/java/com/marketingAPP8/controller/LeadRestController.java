package com.marketingAPP8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketingAPP8.entities.Lead;
import com.marketingAPP8.services.LeadService;

@RestController
@RequestMapping("/api/leads")
public class LeadRestController {
@Autowired
	private LeadService leadService;
	
@GetMapping
public List<Lead> getAllLeads(){
	List<Lead> leads = leadService.listOfLeads();
	return leads;
}

@PostMapping
public void saveLead(@RequestBody Lead lead) {
	leadService.saveLead(lead);
}

@DeleteMapping("/delete/{id}")
public void deleteOneLead(@PathVariable("id") long id) {
	leadService.deleteLeadById(id);
}

@PutMapping
public void updateOneLead(@RequestBody Lead lead) {
	leadService.saveLead(lead);
}

@GetMapping("/lead/{id}")
public Lead getLeadById(@PathVariable("id") long id) {
	Lead lead = leadService.getOneLead(id);
	return lead;
	
}
}
