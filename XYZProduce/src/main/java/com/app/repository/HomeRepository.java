package com.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Employee;

@Repository
public interface HomeRepository extends PagingAndSortingRepository<Employee, Integer> {

	public Employee findAllByUsernameAndPassword(String username, String password);

}
