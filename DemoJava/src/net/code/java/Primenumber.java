/**
 * 
 */
package net.code.java;

import java.util.Scanner;

/**
 * @author LIONS
 *
 */
public class Primenumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner (System.in)) {
			System.out.print(" Enter Number to check if it is prime: ");
			int n = sc.nextInt() ; 
			int num = n ;
			boolean isPrime = true ; 
			
			for (int i=2; i < num/2 ; i++) // you can also use num/ 2 or Math.sqrt(num) to speed
			{
				if(num%i==0)
					isPrime = false;
					break ; 
				
			}
			if (isPrime)
				System.out.println(num + " Yes ! IT is a Prime Number");
			else
				System.out.println(num + " Nope!  not a Prime Number");
		}
		
	}

}
