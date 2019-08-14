package com.ayaz.repository;

import org.springframework.data.repository.CrudRepository;

import com.ayaz.domain.Parent;

public interface ParentRepository extends CrudRepository<Parent, Integer> {

}
