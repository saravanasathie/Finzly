package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int Id;
	private String name;
	private String salary;
	private String profile;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", salary=" + salary + ", profile=" + profile + "]";
	}
	
}
