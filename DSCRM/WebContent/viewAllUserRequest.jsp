<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import ="com.nextech.dscrm.pojo.UserRequest" %>
    <%@ page import="java.util.ArrayList,java.util.Iterator, com.nextech.dscrm.pojo.UserRequest" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All User Request</title>
</head>
<body>
<form action="UserRequestServlet" method="get">

    <table border="1">
    <tr>
             <th>id</th>
              <th>name</th>
              <th>mobile</th>
               <th>email</th>
               <th>requirementDescription</th>
                <th>requestUpdateTime</th>
               <th>requesTtime</th>
               <th>RequestStatus</th>
             
              
    </tr>
   
    
		  <%
        ArrayList<UserRequest> list1=(ArrayList)request.getAttribute("allUsers");
        Iterator it=list1.iterator();
        while(it.hasNext())
        {
        	
        	UserRequest user=(UserRequest)it.next();
        	System.out.println(user.getName());
    %>
    <tr>
        <td><%=user.getId() %></td>
        <td><%=user.getName()%></td>
        <td><%=user.getMobile() %></td>
        <td><%=user.getEmail() %></td>
        <td><%=user.getRequirementDescription() %></td>
        <td><%=user.getRequestUpdateTime() %></td>
        <td><%=user.getRequesTtime()%>
         <td><%=user.getRequestStatus() %></td>
    </tr>
    <%
        }
    %>
    <c:forEach var="userRequest" items="${userRequests}">
    <tr>
    <td>${userRequest.id}</td>
				<td>${userRequest.name}</td>
				<td>${userRequest.mobile}</td>
				<td>${userRequest.email}</td>
				<td>${userRequest.requirementDescription}</td>
				<td>${userRequest.requestTime}</td>
				<td>${userRequest.requestUpdateTime}</td>
    </tr>
    </c:forEach>
		
    </table>
    </form>
</body>
</html>