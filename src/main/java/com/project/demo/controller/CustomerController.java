package com.project.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.demo.model.Customer;
import com.project.demo.service.CustomerService;


@Controller
@RequestMapping("/admin/customer")

public class CustomerController {
	
	@Autowired
	CustomerService customerservice;
	
	@GetMapping("/add")
	public String addCustomer() {
		return "admin/addcustomer";
	}
	
	
	
	@PostMapping("/add")
	public String create(@ModelAttribute Customer customer,
							Model model) {
		customerservice.create(customer);
		return "redirect:/admin/addcustomer";
		
	}
	
	 @GetMapping("/display")
	    public String showCustomer(Model model){
	        List<Customer> c= customerservice.findAll();
	        model.addAttribute("customerlist", c);
	        return "admin/showcustomer";
	    }
	 
	 @GetMapping("/edit/{customer_id}")
	 public String editCustomer(@PathVariable("customer_id") int customer_id ,Model model) {
		  
		  model.addAttribute("Customer", customerservice.findById(customer_id));
		  return"admin/editcustomer";
		 
	 }
	 

	 
	 @PostMapping(path= {"/update"})
		public String update(@ModelAttribute Customer customer,Model model) {
			customerservice.update(customer);
		
			return"redirect:/admin/customer/display";
		}
	 
	 @GetMapping("/delete/{customer_id}")
	    public String delete(@PathVariable("customer_id") int customer_id){
	        customerservice.delete(customer_id);
	        return "admin/showcustomer";
	    }
	 
	

}
