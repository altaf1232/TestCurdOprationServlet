package com.curd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveServlet extends HttpServlet 
{

	private static final long serialVersionUID = 1L;
	 protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException 
	 {
		 res.setContentType("text/html");
		 PrintWriter out=res.getWriter();
		 
		 //create Name data
		 String name=req.getParameter("name"); 
		 String password=req.getParameter("password");
		 String email=req.getParameter("email");
		 String country=req.getParameter("country");
		 
		 //set the value
		// Emp s=new Emp();
		 
		 
	 }
	         

}
