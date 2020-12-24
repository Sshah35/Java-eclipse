/**
 * 
 */
package com.telusko;

import java.lang.reflect.Method;

/**
 * @author LIONS
 *
 */
public class ReflectionCall {

	/**
	 * @param args
	 * Reflection Api that will call the Reflection Api 
	 * @throws Exception 
	 * 
	 * 
	 */
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
			Class c = Class.forName("com.telusko.Test");
			Test t = (Test)c.newInstance(); 
			
			Method m = c.getDeclaredMethod("show", null);	
			m.invoke(t,null);
			
	}

}
