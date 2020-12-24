package com.telusko;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

;

	/*
	 * https://www.youtube.com/watch?v=Q4T7jg0Lv4E&list=PLEAQNNR8IlB4R7NfqBY1frapYo97L6fOQ&index=3
	 *  1. import >>>>>>>>java.sql package in the lib folder created as per above link
	 *     open new goto properties add to system built 
	 *   
	 *  2. Load and Register the driver >>> com.mysql.jdbc.Driver
	 *  3. Create connection     Connection interfce 
	 *  4. Create a statement to Query >> Think 
	 *  5  Execute the query
	 *  6. Process the Result >> resultSet
	 *  7. close
	 *
	 *     
	 */

public class DemoJdbc {

	public static void main(String[] args) {
		
		try {
	
			String url = "jdbc:mysql://localhost:3308";
			String user = "root" ; 
			String password = " ";
			String query = "select * from world " ;
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query); 
			String userData = " ";
			
      		while(rs.next())
			{
      			userData = rs.getString("first_name") ; 
    			System.out.println(userData);
			}
			
			
			st.close( );
			con.close( );
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
