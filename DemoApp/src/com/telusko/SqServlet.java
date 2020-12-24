package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class SqServlet extends HttpServlet
{



	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		
		//int k = (int)req.getParameter("k");   // Uncoment an comment line 23-25 to use with URl session
		
		int k = (int) req.getAttribute("k");
		
		k = k*k ;
		
		PrintWriter out = res.getWriter();

		out.println("Result square of a number is : " + k); 	
	}
	
	
	

}
