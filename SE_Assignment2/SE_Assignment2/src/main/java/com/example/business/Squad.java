package com.example.business;

import java.io.Serializable;

public class Squad implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int squadID;
	private String squadName;
	
	public Squad(int squadID, String squadName) {
		super();
		this.squadID = squadID;
		this.squadName = squadName;
	}

	public int getSquadID() {
		return squadID;
	}

	public void setSquadID(int squadID) {
		this.squadID = squadID;
	}

	public String getSquadName() {
		return squadName;
	}

	public void setSquadName(String squadName) {
		this.squadName = squadName;
	}
	
	
	

}
