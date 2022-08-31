package com.marketingAPP8.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingAPP8.entities.Lead;
import com.marketingAPP8.repository.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
private LeadRepository leadRepo;
	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
	}
	@Override
	public List<Lead> listOfLeads() {
		List<Lead> findAll = leadRepo.findAll();
		return findAll;
	}
	@Override
	public void deleteLeadById(long id) {
		leadRepo.deleteById(id);
	}
	@Override
	public Lead getOneLead(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead leads = findById.get();
		return leads;
	}

}
