package com.example.service;

import com.example.business.Squad;

import java.util.ArrayList;
import java.util.List;

import com.example.business.Player;
import com.example.dao.PlayerDao;
import com.example.dao.SquadDao;
import com.example.exceptions.DaoException;

public class AddPlayerService {
	SquadDao daoS = new SquadDao();
	PlayerDao dao = new PlayerDao();
	public void addPlayer(String fname, String lname, String dob, String email, String contactno, int  player_squadID) {
		try {
			dao.insertPlayerInfo(fname, lname, dob, email, contactno, player_squadID);
		}
		catch(DaoException e){
			e.printStackTrace();
		}
	}



public List<Squad> showSquad() {
	
	List<Squad> s = new ArrayList<Squad>();
	try {
		s = daoS.displaySquad();
	}
		catch (DaoException e) {
			e.printStackTrace();
	}
	
	return s;
	
}
}
