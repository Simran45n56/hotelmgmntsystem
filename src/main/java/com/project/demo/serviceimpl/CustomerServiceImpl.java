 package com.project.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.model.Customer;
import com.project.demo.repository.CustomerRepository;
import com.project.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void create(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer findById(int customer_id) {
		// TODO Auto-generated method stub
		return customerRepository.findById (customer_id);
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		 customerRepository.save(customer);
	}

	@Override
	public void delete(int customer_id) {
		
		// TODO Auto-generated method stub
		
		Customer  customer= findById(customer_id);
		if(customer!=null) {
			
			customerRepository.delete(customer);
			
		}
		
		
			
	}
	
	
	
	

}
