/**
 * 
 */
package net.code.java;

import java.util.Scanner;

/**
 * @author LIONS
 *
 */
public class MyPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (
		Scanner sc = new Scanner(System.in)) {
			System.out.print(" Enter a number value:");
			int n = sc.nextInt() ;
			int r , s=0; 
			int t = 123 ; 
			while(n > 0)
			{
				r = n%10 ;      // 1 2 3 here this will give 3 r 
				n = n/10 ;      // break 3 will give you 12   
				s = s * 10 + r ; // This will terminate the loop
			}
			if (t == s )
				System.out.println(" Given number is Palindrom");
			else
				System.out.println(" IT is not an Palindrom");
		} 	

	}

}
