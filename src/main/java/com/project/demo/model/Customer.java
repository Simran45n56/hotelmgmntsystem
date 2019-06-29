package com.project.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_table")



public class Customer implements Serializable {
	
	private static final long serialVersionUID = 10003L;
	
	
	@Id //primary key
	@GeneratedValue(strategy=GenerationType.AUTO)  // Auto increment
	@Column(name="customer_id")
	private int customer_id;
	@Column(name="customer_name")
	private String customer_name;
	@Column(name="customer_number")
	private String customer_number;
	@Column(name="customer_email")
	private String customer_email;
	@Column(name="customer_address")
	private String customer_address;
	@Column(name="customer_status")
	private boolean customer_status;
	
	public Customer() {
		super();
	}

	public Customer(int customer_id, String customer_name, String customer_number, String customer_email,
			String customer_address, boolean customer_status) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_number = customer_number;
		this.customer_email = customer_email;
		this.customer_address = customer_address;
		this.customer_status = customer_status;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_number() {
		return customer_number;
	}

	public void setCustomer_number(String customer_number) {
		this.customer_number = customer_number;
	}

	public String getCustomer_email() {
		return customer_email;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	public String getCustomer_address() {
		return customer_address;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

	public boolean isCustomer_status() {
		return customer_status;
	}

	public void setCustomer_status(boolean customer_status) {
		this.customer_status = customer_status;
	}
	
	
	
	
	
	
	

}
