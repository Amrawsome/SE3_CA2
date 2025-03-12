<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
      body {
        padding: 25px;
        background-color: white;
        color: black;
        font-size: 25px;
      }
      .dark-mode {
        background-color: black;
        color: white;
      }
      .light-mode {
        background-color: white;
        color: black;
      }
    </style>
</head>

<body>
	Servlet forwarded to me... loginSuccess.jsp
	
	<br/><br/>
	
	<br/><br/>
    <form action="FrontController" method="post">
	     <input type="hidden" name="action" value="AddPlayer" />
         <input type="submit" value="Add Player" />
    </form>  
    <c:set var="pA" value="${sessionScope.pAdded}"/>
    <p>${pA}</p>
    <c:remove var="pA" scope="session"/>
    
    <c:set var="nS" value="${sessionScope.noSquad}"/>
    <p>${nS}</p>
    <c:remove var="nS" scope="session"/>
    
</body>

</html>