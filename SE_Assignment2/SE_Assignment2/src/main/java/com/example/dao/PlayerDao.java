package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.business.Player;
import com.example.exceptions.DaoException;

public class PlayerDao extends Dao {
	
	public void insertPlayerInfo(String fname, String lname, String dob, String email, String contactno, int player_squadID) throws DaoException {
		Connection con = null;
		PreparedStatement ps = null;
		int insertQuery =0;
		
		try {
			con = this.getConnection();
			String insert = "INSERT INTO player (FIRST_NAME,LAST_NAME,DOB,EMAIL,ContactNO,player_squadID) VALUES(?, ?, ?, ?, ?, ?)" ;
			
			ps = con.prepareStatement(insert);
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, dob);
			ps.setString(4, email);
			ps.setString(5, contactno);
			ps.setInt(6, player_squadID);
			
			
			insertQuery = ps.executeUpdate();
		}
		catch (SQLException e) {
            throw new DaoException("insertPlayer" + e.getMessage());
            
	}
		
		
	}
}
