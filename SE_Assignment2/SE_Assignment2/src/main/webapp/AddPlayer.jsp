<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
</head>
</head>

<body>
Servlet forwarded to me... AddPlayer.jsp
			<c:set var="SQUAD" value="${sessionScope.SQUAD}"/>
            <form action="FrontController" method="post">
            	<script type="text/javascript">
				$(document).ready(function () {
    			$('#checkBtn').click(function() {
      			checked = $("input[type=checkbox]:checked").length;

      if(!checked) {
        alert("You must check at least one checkbox.");
        return false;
      }

    });
});

</script>
                <table>
                    <tr>
                        <td> First Name  : </td><td> <input name="fname" size=30 type="text" required="required" pattern="[A-Za-z0-9]{1,20}" /> </td> 
                    </tr>
                    <tr>
                        <td> Last Name  : </td><td> <input name="lname" size=30 type="text" required="required" pattern="[A-Za-z0-9]{1,20}"  /> </td> 
                    </tr>
                    <tr>
                        <td> Date Of Birth  : </td><td> <input name="dob" size=15 type="text" required="required" pattern="[A-Za-z0-9/]{1,20}" /> </td> 
                    </tr>
                    <tr>
                        <td> Email  : </td><td> <input name="email" size=30 type="text" required="required" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" />  </td> 
                    </tr>
                    <tr>
                        <td> Contact Number  : </td><td> <input name="contactnum" size=30 type="text" required="required" pattern="[A-Za-z0-9+]{1,20}" /> </td> 
                    </tr>
                     <c:forEach var="s" items="${SQUAD}">
						  <tr>
							</tr>
					<td><input type = "checkbox" name ="squads" value = "${s.squadID}"><label style = "font-size:15px ">${s.squadName}</label></td>
						</c:forEach> 
                </table>
                
                <input type="hidden" name="action" value="AddPlayer" />
                <input type="submit" value="AddPlayer" />
            </form>
            <br></br>	
            <button onclick="location.href = 'http://localhost:7070/SE_Assignment2/Dashboard.jsp';" id="myButton"  >Cancel</button>
	
</body>
</html>