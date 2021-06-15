package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Employee;
import com.app.repository.HomeRepository;

@Service
public class ServiceImpl implements ServiceInterface {

	@Autowired
	HomeRepository ri;

	@Override
	public void save(Employee e) {
		ri.save(e);
	}

	@Override
	public List<Employee> login(String username, String password) {

		Employee e = ri.findAllByUsernameAndPassword(username, password);
		if (e != null) {
			List<Employee> list = (List<Employee>) ri.findAll();
			return list;
		} else {
			return null;
		}
	}

	@Override
	public List<Employee> getdata() {
		List<Employee> list = (List<Employee>) ri.findAll();
		return list;
	}

	@Override
	public List<Employee> delete(int id) {
		ri.deleteById(id);

		List<Employee> list = (List<Employee>) ri.findAll();
		return list;
	}

	@Override
	public List<Employee> update(Employee e) {
		ri.save(e);
		List<Employee> list = (List<Employee>) ri.findAll();
		return list;
	}

}
