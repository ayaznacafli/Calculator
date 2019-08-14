package com.ayaz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayaz.domain.Parent;
import com.ayaz.repository.ParentRepository;
import com.ayaz.service.ParentService;

@Service
public class ParentServiceImpl implements ParentService {
	
	@Autowired
	private ParentRepository parentRepository;


	@Override
	public void insert(Parent parent) {
		parentRepository.save(parent);
	}

	@Override
	public List<Parent> getParents() {
		return (List<Parent>) parentRepository.findAll();
	}
}
