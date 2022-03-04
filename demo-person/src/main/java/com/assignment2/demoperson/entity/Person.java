package com.assignment2.demoperson.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private int salary;
	private String designation;
	
	protected Person() {}
	
	public Person(String name, int salary, String designation) {
		super();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "/nPerson [name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}
	
	

}
