package com.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	public void add(Employee e)
	{
		dao.add(e);
	}
	public void delete(Employee e)
	{
		dao.delete(e);
	}
	public List<Employee> getEmployee() {
		return dao.getAllEmployee();
	}
	public void update(Employee e)
	{
		dao.update(e);
	
		
	}
	

}
