package com.app.SpringbootJpaRepository.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.SpringbootJpaRepository.entity.Person;
import com.app.SpringbootJpaRepository.exception.DuplicateException;
import com.app.SpringbootJpaRepository.exception.PersonNotFoundException;
import com.app.SpringbootJpaRepository.repository.PersonService;
@RestController
@RequestMapping("/person")
public class PersonController {

@Autowired
PersonService perservice;
@GetMapping("person/{perId}")
public Optional<Person> getAllPersons(@PathVariable Long perId){
	return perservice.getById(perId);
}
@GetMapping("/{perId}")
public  Person getPersonById(@PathVariable Long perId)throws PersonNotFoundException
{
	Optional<Person> person=perservice.getPersonById(perId);
	if(person.isPresent())
		return person.get();
	else
		throw new PersonNotFoundException("person is not available");
}
@GetMapping("personName/{perName}")
public List<Person> getPersonByName(@PathVariable String perName)
{
return perservice.findByName(perName);	
}
@GetMapping("/person")
public List<Person> getAll() {
	return perservice.getAllPersons();
}

@PostMapping("/person/add")
public Person addPerson(Person person)
{
	return perservice.addPerson(person);
}
@PostMapping("/person/add1")
public Person addPerson1(Person person)throws DuplicateException
{
if(getPersonByEmail(person.getPerEmail()) !=null)
{
	throw new DuplicateException("name already available");
}
else return perservice.addPerson1(person);

}
public Person getPersonByEmail(String email) {
	// TODO Auto-generated method stub
	return perservice.getPersonByEmail(email);
}
public Person getEmail(Person person) {
	// TODO Auto-generated method stub
	return   perservice.getEmail(person);
}
@PutMapping("/update")
public Person updatePerson(Person person)
{
	return perservice.updatePerson(person);
}
@DeleteMapping("/delete/{empId}")
public void Person(@PathVariable Long empId)
{
	 perservice.deletePerson(empId);
	
}




}

