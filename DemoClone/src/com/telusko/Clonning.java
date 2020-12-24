/**
 * 
 */
package com.telusko;

/**
 * @author LIONS
 *
 */
public class Clonning {

	/**
	 * @param args
	 * 
	 * Copy of the shallow copy , deep copy & clonning
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {

		
	System.out.println(" This is clonning programm how to copy ne"
			+ "new address. ");
	ClassA obj = new ClassA( );
//    ClassA obj1 = new ClassA( );
	
	obj.i=5;
	obj.j=7;
/*	
	ClassA obj1 =obj;
	// shallow copy fetching the values from obj 
	obj1.i=8;
	obj.show();
*/
	
	// Clone directly using the clone method. 
	ClassA obj2 =  (ClassA)obj.clone();
	
	System.out.println(obj2);
	System.out.println(obj);
	
	
	}

}
