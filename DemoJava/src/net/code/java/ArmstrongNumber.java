package net.code.java;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		// 153 > 1 5 3  ( 1*1*1 + 5*5*5 + 3*3*3) if 1 + 127 + 27 = 153 it is Armstrong 
		
		// 370 > (3*3*3 + 7*7*7 + 0*...) => 370 it is an Armstrong
	
		try (Scanner sc = new Scanner (System.in)) {
			System.out.print(" Enter a number to check: ");
			int n = sc.nextInt();	
			int temp= n ;
			int r,sum = 0 ; 
			while(n>0) 
			{	
				r= n%10 ; 
				n= n/10 ; 
				sum += r * r * r ; 	
			}
			if (temp==sum)
				System.out.println("This is an armstrong Number");
			else
				System.out.println("It is not an Armstron");				
			
		}		
		
	}

}
