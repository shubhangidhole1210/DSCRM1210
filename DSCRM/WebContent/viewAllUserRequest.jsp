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
   <c:forEach items="${allUsers}" var="user">
    <p>${user.id}</p><br/>
    <p>${user.name}</p><br/>
    <p>${user.mobile}</p><br/>
    <p>${user.email}</p><br/>
    <p>${user.requirementDescription}</p><br/>
    <p>${user.requestUpdateTime}</p><br/>
    <p>${user.requesTtime}</p><br/>z
    <p>${user.requestStatus}</p><br/>
    </c:forEach>
   
    </table>
    </form>
</body>
</html>