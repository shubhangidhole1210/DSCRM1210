<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import ="com.nextech.dscrm.pojo.UserRequest" %>
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
    
    <tr>
    
		 <c:forEach var="user" items="requestScope.allUsers"> 
		 <c:out value="${user.id}"/>
		 <c:out value="${user.name}"/>
		  <c:out value="${user.mobile}"/>
		   <c:out value="${user.email}"/>
		    <c:out value="${user.requirementDescription}"/>
		       <c:out value="${user.requestUpdateTime}"/>
		       <c:out value="${user.requesTtime}"/>
		        <c:out value="${user.requestStatus}"/>
		    
		 </c:forEach>
    
	</tr>	


   
    </table>
    </form>
</body>
</html>