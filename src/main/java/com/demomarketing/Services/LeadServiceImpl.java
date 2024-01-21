package com.demomarketing.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demomarketing.Entity.Lead;
import com.demomarketing.Repository.LeadRepository;
@Service
public class LeadServiceImpl implements SaveOneLead {

	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void saveOneLead(Lead lead) {
		leadRepo.save(lead);
		
	}

}
