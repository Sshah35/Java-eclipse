/**
 * 
 */
package com.telusko;

/**
 * @author LIONS
 *
 */
public class ClassA implements Cloneable{
	int i   ; 
	int j  ;
	public  void show() {
		// TODO Auto-generated method stub
		System.out.println(" This is the Class A Hello world");
		
	}
	@Override
	public Object clone( ) throws CloneNotSupportedException {
		
		return super.clone() ; 
	}
	
	@Override
	public String toString() {
		return "ClassA [i=" + i + ", j=" + j + "]";
	}
	
	

}
