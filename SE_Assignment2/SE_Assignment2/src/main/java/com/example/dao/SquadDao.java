package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.business.Squad;
import com.example.exceptions.DaoException;

public class SquadDao extends Dao {
	
	public List<Squad> displaySquad() throws DaoException{
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Squad> s = new ArrayList<Squad>();
		
		try {
			con = this.getConnection();
			
			String query = "SELECT * FROM SQUAD";
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				int squadID = rs.getInt("squadID");
				String squadName = rs.getString("squadName");
				s.add(new Squad(squadID,squadName));
			}
			
		}
		catch(SQLException e){
			throw new DaoException("showSquad" + e.getMessage());
		}
		finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                throw new DaoException("showSquad" + e.getMessage());
            }
        }
		return s;
		
	}

}
