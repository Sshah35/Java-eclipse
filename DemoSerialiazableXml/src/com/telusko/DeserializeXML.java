package com.telusko;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class DeserializeXML {

	public static void main(String[] args) {
		
		try {
			XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream("SerCollegeXML.txt")));
			
			College c = (College)x.readObject();
			
			List<Students> s = c.getStudents();
			
			for(Students value : s )
			{
				System.out.println(value);
				
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
