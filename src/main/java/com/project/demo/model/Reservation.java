package com.project.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reservation_table")

public class Reservation implements Serializable {
	
	private static final long serialVersionUID = 10003L;
	
	@Id //primary key
	@GeneratedValue(strategy=GenerationType.AUTO)  // Auto increment
	@Column(name="reservation_id")
	private int reservation_id;
	@Column(name="reservation_name")
	private String reservation_name;
	@Column(name="reservation_number")
	private String reservation_number;
	@Column(name="reservation_email")
	private String reservation_email;
	@Column(name="reservation_address")
	private String reservation_address;
	@Column(name="reservation_type")
	private String reservation_type;
	
	public Reservation() {
		super();
	}

	public Reservation(int reservation_id, String reservation_name, String reservation_number, String reservation_email,
			String reservation_address, String reservation_type) {
		super();
		this.reservation_id = reservation_id;
		this.reservation_name = reservation_name;
		this.reservation_number = reservation_number;
		this.reservation_email = reservation_email;
		this.reservation_address = reservation_address;
		this.reservation_type = reservation_type;
	}

	public int getReservation_id() {
		return reservation_id;
	}

	public void setReservation_id(int reservation_id) {
		this.reservation_id = reservation_id;
	}

	public String getReservation_name() {
		return reservation_name;
	}

	public void setReservation_name(String reservation_name) {
		this.reservation_name = reservation_name;
	}

	public String getReservation_number() {
		return reservation_number;
	}

	public void setReservation_number(String reservation_number) {
		this.reservation_number = reservation_number;
	}

	public String getReservation_email() {
		return reservation_email;
	}

	public void setReservation_email(String reservation_email) {
		this.reservation_email = reservation_email;
	}

	public String getReservation_address() {
		return reservation_address;
	}

	public void setReservation_address(String reservation_address) {
		this.reservation_address = reservation_address;
	}

	public String getReservation_type() {
		return reservation_type;
	}

	public void setReservation_type(String reservation_type) {
		this.reservation_type = reservation_type;
	}
	
	
	
	
	
	

}
