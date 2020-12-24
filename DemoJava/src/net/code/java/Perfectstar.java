package net.code.java;

import java.util.Scanner;

public class Perfectstar 
{
    // Perfect number 6   factor of 6 are 1 2 3 if it sums up to 6 it is a perfect number 
	                      // factor of 28 = 1 + 2 + 4 + 7 + 14 = 28  or 
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.print(" Enter number to Check if it is perfect number: ");
			int a = sc.nextInt();
			boolean b = isPerfect(a); 
			if(b)
				System.out.println(" IT is a perfect number");
			else
				System.out.println("IT is not a Perfect number");			
		}
	}

	private static boolean isPerfect( int n)
	{
		int sum = 0 ; 	
		for (int i = 1; i<n ; i++) 
		{
			if (n%i==0)
				sum += i ; 
		}
		if (n==sum)
			return true ; 
		return false;  // BY default this will print the false 
	}

}
