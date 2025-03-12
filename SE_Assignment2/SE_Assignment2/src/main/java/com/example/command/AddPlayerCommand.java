package com.example.command;

import com.example.business.Player;
import com.example.business.Squad;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.service.AddPlayerService;

public class AddPlayerCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		AddPlayerService APS = new AddPlayerService();
		List<Squad> squad = new ArrayList<Squad>();
		String forwardToJsp="";
		
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String dateOfBirth = request.getParameter("dob");
		String email = request.getParameter("email");
		String contactno = request.getParameter("contactnum");
		String[] squadnum = request.getParameterValues("squads");
		
		squad = APS.showSquad();
		if(squadnum!=null) {
			
		int size = squadnum.length;
		for(int i=0; i<size;i++) {
			String g = squadnum[i];
			System.out.println(g);
		}
		int[] SquadNum = new int [size];
		for(int i=0; i<size; i++) {
			SquadNum[i] = Integer.parseInt(squadnum[i]);
		}
			int squadS=SquadNum.length;
			for(int i=0; i<squadS;i++) {
				int	s = SquadNum[i];
				APS.addPlayer(firstName, lastName, dateOfBirth, email, contactno,s);
			}
			String pAdded = "Player Added";
			request.getSession().setAttribute("pAdded", pAdded);
			forwardToJsp = "/Dashboard.jsp";
		}
		else {
			if(squad == null ||  squad.isEmpty())
				{
				String noSquad = "Please create a Squad to add players to.";
				request.getSession().setAttribute("noSquad", noSquad);
				forwardToJsp = "/Dashboard.jsp";	
				}
			else
				{
					HttpSession session = request.getSession();
					session.setAttribute("SQUAD", squad);
					forwardToJsp = "/AddPlayer.jsp";		
				}
			
		}
		return forwardToJsp;
	}
	
}

