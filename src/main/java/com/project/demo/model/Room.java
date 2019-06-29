
package com.project.demo.model;

	import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	
	@Entity
	@Table(name="room_table")
	
	public class Room implements Serializable {
		  
			private static final long serialVersionUID = 10003L;
			
			@Id//primary key
			@GeneratedValue(strategy=GenerationType.AUTO) // Auto increment
			@Column(name="room_id")
			private int room_id;
			@Column(name="room_type")
			private String room_type;
			@Column(name="room_rate")
			private String room_rate;
			@Column(name="room_description")
			private String room_description;
			@Column(name="room_image")
			private String room_image;
			@Column(name="room_status")
			private boolean room_status;
			
			public Room() {
				super();
			}

			public Room(int room_id, String room_type, String room_rate, String room_description, String room_image,
					boolean room_status) {
				super();
				this.room_id = room_id;
				this.room_type = room_type;
				this.room_rate = room_rate;
				this.room_description = room_description;
				this.room_image = room_image;
				this.room_status = room_status;
			}

			public int getRoom_id() {
				return room_id;
			}

			public void setRoom_id(int room_id) {
				this.room_id = room_id;
			}

			public String getRoom_type() {
				return room_type;
			}

			public void setRoom_type(String room_type) {
				this.room_type = room_type;
			}

			public String getRoom_rate() {
				return room_rate;
			}

			public void setRoom_rate(String room_rate) {
				this.room_rate = room_rate;
			}

			public String getRoom_description() {
				return room_description;
			}

			public void setRoom_description(String room_description) {
				this.room_description = room_description;
			}

			public String getRoom_image() {
				return room_image;
			}

			public void setRoom_image(String room_image) {
				this.room_image = room_image;
			}

			public boolean isRoom_status() {
				return room_status;
			}

			public void setRoom_status(boolean room_status) {
				this.room_status = room_status;
			}
			
			
			
			
			
			
		}

	


