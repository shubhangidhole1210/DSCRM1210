<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UserRequestServlet" method="get"></form>
    <table border="1">
    <tr>
             <th>id</th>
              <th>name</th>
              <th>mobile</th>
               <th>email</th>
               <th>requirementDescription</th>
               <th>requesttime</th>
              <th>requestUpdateTime</th>
              
    </tr>
   
    
		  <%
        ArrayList<userrequest> list1=(ArrayList)request.getAttribute("list");
        Iterator it=list1.iterator();
        while(it.hasNext())
        {
        	userrequest user=(userrequest)it.next();
    %>
    <tr>
        <td><%=user.name %></td>
        <td><%=user.mobile %></td>
        <td><%=user.email %></td>
        <td><%=user.requirementDescription %></td>
    </tr>
    <%
        }
    %>
		
    </table>
</body>
</html>