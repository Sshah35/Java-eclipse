package com.telusko;

public class Students {

	private int rollno ; 
	private String name ;
	/**
	 * 
	 */

	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}

	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + "]";
	} 
	
	
	
}
