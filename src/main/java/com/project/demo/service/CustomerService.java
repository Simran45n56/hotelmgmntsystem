package com.project.demo.service;

import java.util.List;

import com.project.demo.model.Customer;


public interface CustomerService {
	
	public void create(Customer customer);
	
	public List<Customer> findAll();
	
	public Customer findById(int customer_id);
	
	public void update(Customer customer);
	
	public void delete(int customer_id);
}
