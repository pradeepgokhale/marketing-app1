package com.marketingAPP8.services;

import java.util.List;

import com.marketingAPP8.entities.Lead;

public interface LeadService {
public void saveLead(Lead lead);

public List<Lead> listOfLeads();

public void deleteLeadById(long id);

public Lead getOneLead(long id);
}
