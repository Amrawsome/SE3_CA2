package com.example.business;

import java.io.Serializable;

public class Player implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String firstName;
	private String lastName;
	private String DOB;
	private String Email;
	private String contactNO;
	private int player_squadid;
	
	public Player(int id, String firstName, String lastName, String dOB, String email, String contactNO,
			int player_squadid) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		DOB = dOB;
		Email = email;
		this.contactNO = contactNO;
		this.player_squadid = player_squadid;
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
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getContactNO() {
		return contactNO;
	}
	public void setContactNO(String contactNO) {
		this.contactNO = contactNO;
	}
	public int getPlayer_squadid() {
		return player_squadid;
	}
	public void setPlayer_squadid(int player_squadid) {
		this.player_squadid = player_squadid;
	}
	
	
	
}
