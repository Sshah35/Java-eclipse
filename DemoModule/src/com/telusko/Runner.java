/**
 * 
 */
package com.telusko;

import com.telusko.util.Calculator;

/**
 * @author LIONS
 *
 */

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int result;
		
		Calculator c = new Calculator ( ); 
		
		result = c.add(5.5, 6); 
		
		System.out.println(result);
	} 

}
