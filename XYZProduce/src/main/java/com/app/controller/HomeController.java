package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;
import com.app.service.ServiceImpl;

@RestController
public class HomeController {

	@Autowired

	ServiceImpl si;

	@RequestMapping(value = "/")
	public String home() {
		System.out.println("Welcome...");
		return "Welcome...";
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public Employee save(@RequestBody Employee e) {
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAddress());
		System.out.println(e.getUsername());
		System.out.println(e.getPassword());

		System.out.println("Registration Successfully...");
		si.save(e);
		return e;
	}

	@RequestMapping(value = "/employee/{username}/{password}", method = RequestMethod.GET)
	public List<Employee> login(@PathVariable String username, @PathVariable String password) {
		List<Employee> list = si.login(username, password);
		if (list != null) {
			System.out.println("Login Successfully...");
			return list;
		} else {
			System.out.println("Invalid Username And Password");
			return null;
		}
	}

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public List<Employee> listdata() {
		List<Employee> list = si.getdata();
		System.out.println("All Data Found...");
		return list;
	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
	public List<Employee> delete(@PathVariable int id) {
		List<Employee> list = si.delete(id);
		System.out.println("Delete Successfully...");
		return list;
	}

	@RequestMapping(value="/employee", method=RequestMethod.PUT)
	public List<Employee> update(@RequestBody Employee e) {
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAddress());
		System.out.println(e.getUsername());
		System.out.println(e.getPassword());
		
		System.out.println("Update Successfully...");

		List<Employee> list = si.update(e);
		return list;
	}

}
