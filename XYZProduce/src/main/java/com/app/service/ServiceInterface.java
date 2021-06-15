package com.app.service;

import java.util.List;

import com.app.model.Employee;

public interface ServiceInterface {
	
	public void save(Employee e);
	
	public List<Employee> login(String username, String password);
	
	public List<Employee> getdata();
	
	public List<Employee> delete(int id);
	
	public List<Employee> update(Employee e);

}
