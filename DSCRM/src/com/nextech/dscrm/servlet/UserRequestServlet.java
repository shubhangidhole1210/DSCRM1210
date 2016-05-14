package com.nextech.dscrm.servlet;

//import java.beans.Statement;
import java.sql.*;
import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import jdk.nashorn.internal.ir.RuntimeNode.Request;


import com.sun.corba.se.pept.transport.Connection;


@WebServlet("/UserRequestServlet")
public class UserRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private ServletResponse response;
	private Object list;
       
  
    public UserRequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		((UserRequestServlet) request).getAllUserRequests();
		request.setAttribute("list",list);
		response.setContentType("text/html");
	      ServletContext context=getServletContext();
	      RequestDispatcher dispatcher=context.getRequestDispatcher("viewAllUserRequest.JSP");
	      dispatcher.forward(request, response);
	}
	
	public void getAllUserRequests()
	{
		ArrayList<userrequest> list = new ArrayList<userrequest>();
		try{
		    Class.forName("com.mysql.jdbc.Driver");
		    Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/TEST","root","system");

		    PreparedStatement pps = ((java.sql.Connection) conn).prepareStatement("SELECT * FROM dscrm.userrequest");
		    ResultSet rs = pps.executeQuery();
		    while(rs.next()){
		    //do something
		   /* System.out.println(rs.getString("name"));
		    System.out.println(rs.getString("mobile"));
		    System.out.println(rs.getString("email"));
		    System.out.println(rs.getString("requirementDescription"));
		    */
		    	userrequest user=new userrequest();
		    	user.name=rs.getString("name");
		    	user.mobile=rs.getString("mobile");
		    	user.email=rs.getString("email");
		    	user.requirementDescription=rs.getString("requirementDescription");
		    	list.add(user);
		   
		    }
		    
		//close connection
		conn.close();
		    }catch(Exception ex){
		      // do something
		    }  
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
