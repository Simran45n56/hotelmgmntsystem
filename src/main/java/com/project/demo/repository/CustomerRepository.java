package com.project.demo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.project.demo.model.Customer;



public interface CustomerRepository extends Repository <Customer,Integer> {
	
	void delete(Customer customer);
	
	List<Customer> findAll();
	
	Customer findById (int customer_id);
	
	Customer save(Customer customer);
	

}
