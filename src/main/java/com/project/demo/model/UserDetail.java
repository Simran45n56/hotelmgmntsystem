package com.project.demo.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="userdetail_table")

public class UserDetail implements Serializable {
	
	private static final long serialVersionUID = 10003L;
	
	  @OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="userDetail")
	    private UserRole userRole;
	
	  @Id                             
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    @Column(name="userdetail_id")
	    private int id;
	  @Column(name="userdetail_firstname")
	    private String firstName;
	  @Column(name="userdetail_lastname")
	    private String lastName;
	  @Column(name="userdetail_dob")
	    private LocalDate dob;
	  @Column(name="userdetail_password")
	    private String password;
	  @Column(name="userdetail_active")
	    private String active;
	  
	public UserDetail() {
		super();
	}

	public UserDetail(UserRole userRole, int id, String firstName, String lastName, LocalDate dob, String password,
			String active) {
		super();
		this.userRole = userRole;
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.password = password;
		this.active = active;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}
	  
	
	
	
	  

}
