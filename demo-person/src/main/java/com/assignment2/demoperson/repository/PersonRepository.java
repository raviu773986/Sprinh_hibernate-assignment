package com.assignment2.demoperson.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.assignment2.demoperson.entity.Person;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class PersonRepository {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	EntityManager em;
	
	
	public Person findById(Long id)
	{
		return em.find(Person.class, id);
	}
	
	
	public void deleteById(Long id)
	{
		Person person=findById(id);
		em.remove(person);
	}
	
	
	public Person save(Person person)
	{
		if(person.getId()==null) 
		{
			//insert
			em.persist(person);
		}
		else
			if(person.getId()!=null) 
		{
			//update
			em.merge(person);
		}
		return person;
	}
	
	

}
