package com.nextech.dscrm.servlet;

import java.sql.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nextech.dscrm.pojo.UserRequest;

@WebServlet("/UserRequestServlet")
public class UserRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private ServletResponse response;
//	private Object list;
       
  
    public UserRequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
		List<UserRequest> allUsers = getAllUserRequests();
		System.out.println("allUsers length : "  +allUsers.size());
		//((UserRequestServlet) request).getAllUserRequests();
		 request.setAttribute("allUsers", allUsers);
	      request.getRequestDispatcher("/viewAllUserRequest.jsp").forward(request, response);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("rawtypes")
	public List getAllUserRequests()
	{
		ArrayList<UserRequest> allUsers = new ArrayList<UserRequest>();
		try{
			System.out.println("Inside getAllUserRequests...");
		    Class.forName("com.mysql.jdbc.Driver");
		    Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/DSCRM","root","system");

		    PreparedStatement pps = conn.prepareStatement("SELECT * FROM dscrm.userrequest");
		    ResultSet rs = pps.executeQuery();
		    while(rs.next()){
		  
		    	System.out.println("Inside while getAllUserRequests...");
		    	UserRequest user=new UserRequest();
		    	user.setId(rs.getInt("id"));
		    	user.setName(rs.getString("name"));
		    	user.setMobile(rs.getString("mobile"));
		    	user.setEmail(rs.getString("email"));
		    	user.setRequirementDescription(rs.getString("requirementDescription"));
		    	user.setRequestUpdateTime(rs.getTimestamp("requestUpdateTime"));
		    	user.setRequesTtime(rs.getTimestamp("requesTtime"));
		    	user.setRequestStatus(rs.getInt("requestStatus"));
		        allUsers.add(user);
		   
		    }
		    
		//close connection
		conn.close();
		    }catch(Exception ex){
		      // do something
		    	ex.printStackTrace();
		    }
		return allUsers;  
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
