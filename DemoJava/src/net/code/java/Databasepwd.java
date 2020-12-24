package net.code.java;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Databasepwd {

	public static void main(String[] args) throws Exception {
	
		Properties p = new Properties(); 
		
		OutputStream os = new FileOutputStream("dataconfig.properties");
		
		
		p.setProperty("url", "localhose:3306/myDb"); 
		p.setProperty("uname", "root");
		p.setProperty("pass", "Vidhi2013$");
		
		p.store(os, null);
	}

}
