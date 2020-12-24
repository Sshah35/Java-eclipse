package com.telusko;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializableXML {

	public static void main(String[] args) throws Exception {

		Students st1 = new Students();
		Students st2 = new Students();

		st1.setName("sam");
		st1.setRollno(123);

		st2.setName("john");
		st2.setRollno(345);

		List<Students> s = new ArrayList<Students>();

		s.add(st1);
		s.add(st2);

		College c = new College();
		c.setStudents(s);

		XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("SerCollegeXML.txt")));
		x.writeObject(c);
		x.close();

	}

}