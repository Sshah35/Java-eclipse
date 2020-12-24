/**
 * 
 */
package com.telusko;


import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	/*
	 * public void service(HttpServletRequest req, HttpServletResponse res) throws
	 * IOException {
	 * 
	 * int i = Integer.parseInt(req.getParameter("num1")); int j =
	 * Integer.parseInt(req.getParameter("num2")); int k = i + j;
	 * 
	 * PrintWriter out = res.getWriter();
	 * 
	 * // systemout.println("results is : "+ k ); out.println("results is : " + k);
	 * 
	 * }
	 * 
	 */
	/*
	 * public void doGet(HttpServletRequest req, HttpServletResponse res) throws
	 * IOException { // call the method service metho }
	 * 
	 * public void doPost(HttpServletRequest req, HttpServletResponse res) throws
	 * IOException { // call the method s }
	 */
	
	  public void service(HttpServletRequest req, HttpServletResponse res) throws
	  IOException , ServletException
	  {
	  
	  int i = Integer.parseInt(req.getParameter("num1")) ; 
	  
	  int j = Integer.parseInt(req.getParameter("num2")); 
	  
	  int k = i + j ;
	  
//	  k = k*k ;
//	  
//	  PrintWriter out = res.getWriter();
//	  
//
//	  out.println("results is : "+ k );
	  // passing the value to another servlet
	  
	  req.setAttribute("k", k);
	  
	  RequestDispatcher rd = req.getRequestDispatcher("sq");
	  rd.forward(req,res);
	  
	 // res.sendRedirect("sq");  // To use this in the sq uncomment every thing then use sysout 
	  
	  
	  
	  
	  }
	 
}
