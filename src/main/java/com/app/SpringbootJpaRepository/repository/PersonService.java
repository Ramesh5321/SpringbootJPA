package com.app.SpringbootJpaRepository.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.SpringbootJpaRepository.entity.Person;
@Service
public class PersonService {
	@Autowired
	PersonRepository perRepository;

	public Optional<Person> getById(Long perId) {
		// TODO Auto-generated method stub
		return (Optional<Person>) perRepository.findById(perId);
	}
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return perRepository.findAll();
	}
	public List<Person> findByName(String perName) {
		// TODO Auto-generated method stub
		return perRepository.findAll();
	}
	public void deletePerson(Long perId) {
		// TODO Auto-generated method stub
		perRepository.deleteById(perId);
	}
	public Person updatePerson(Person person) {
		// TODO Auto-generated method stub
		return perRepository.save(person);
	}
	public Optional<Person> getPersonById(Long perId) {
		// TODO Auto-generated method stub
		return perRepository.findById(perId);
	}
	public Person addPerson(Person person) {
		// TODO Auto-generated method stub
		return perRepository.save(person);
	}
	public Person addPerson1(Person person) {
		// TODO Auto-generated method stub
		return perRepository.save(person);
	}

	public Person getPersonByEmail(Person person) {
		// TODO Auto-generated method stub
		return perRepository.save(person);
	}
	public Person getEmail(Person person) {
		// TODO Auto-generated method stub
		return perRepository.save(person);
	}
	public Person getPersonByEmail(String email) {
		// TODO Auto-generated method stub
		return perRepository.save(email);
	}
	

	




}
