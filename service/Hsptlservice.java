package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Hsptlentity;
import com.example.demo.repo.Hsptlrepo;

@Service
public class Hsptlservice {
	
	@Autowired
	Hsptlrepo hsptlrepo;
	
	public Hsptlentity addHsptltodb(Hsptlentity hsptl) {
		return hsptlrepo.save(hsptl);
		
	}

	public Hsptlentity getPatientById( int id) {
		return hsptlrepo.getByPid(id);
	}

}