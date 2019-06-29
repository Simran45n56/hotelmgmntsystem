package com.project.demo.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="userrole_table")

public class UserRole implements Serializable {
	
	private static final long serialVersionUID = 10003L;
	
	   @OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	    @JoinColumn(name="userdetail_id",nullable=false)
	   private UserDetail userDetail;
	
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    @Column(name="userrole_id")
	    private int id;
	 @Column(name="userrole_role")
	    private String role;
	 
	public UserRole() {
		super();
	}

	public UserRole(UserDetail userDetail, int id, String role) {
		super();
		this.userDetail = userDetail;
		this.id = id;
		this.role = role;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	 
	
	
	
	 

}
