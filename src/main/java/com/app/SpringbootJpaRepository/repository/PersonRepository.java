package com.app.SpringbootJpaRepository.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.SpringbootJpaRepository.entity.Person;

public interface PersonRepository extends JpaRepository<Person,Long> {

	Person save(String email);

	
}
