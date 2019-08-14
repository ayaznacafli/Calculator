package com.ayaz.service;

import java.util.List;

import com.ayaz.domain.Parent;

public interface ParentService {

	void insert(Parent parent);

	List<Parent> getParents();

}
