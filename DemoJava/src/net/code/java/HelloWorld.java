package net.code.java;

import java.util.Scanner;

public class HelloWorld {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello World ");
	     
		 // printing the square
		
		for (int i=1; i <=5 ; i++ )
		{
			for (int j=1; j<=5; j++)
				
			{
				System.out.print("*");
			   
			}
			 System.out.println("" );
			
		}
		 System.out.println("" );
		 
			
			for (int i=1; i <=5 ; i++ )
			{
				for (int j=1; j<=5; j++)
					
				{   
					if (i==1||i==5||j==1||j==5)
						System.out.print("*");
					else
						System.out.print(" ");
				   
				}
				 System.out.println("" );
				
			}
			 System.out.println("" );
			 
			 
		 // printing the triangle pattern 
		for (int i=1; i <=4 ; i++ )
		{
			for (int j=1; j<=i; j++)
				
			{
				System.out.print("*");
			   
			}
			 System.out.println("" );
			
		}
		 System.out.println("" );
		 
		 // Printing the patterns 1 and o 
		 
		for (int i=1; i <=5 ; i++ )
		{
			for (int j=1; j<=i; j++)	
			{
				if ((i+j)%2==0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println(" " );		
		}
		System.out.println(" " );	
		
		 // printing the rows out in a triangle 
		
		for (int i=1; i <=5 ; i++ )
		{
			for (int j=1; j<=i; j++)	
			{
					System.out.print(i + " ");
			}
			System.out.println(" " );		
		}
		System.out.println(" " );

// Fibo series
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter any number:");
			int n = sc.nextInt() ;
			
			int a=1,b=1,c ; 
			
			c = 0 ;
			System.out.print("1 1 ");
			while (c <= n)
			{
				c = a + b ;
				System.out.print(c + " ");
				a=b ; 
				b=c ; 
			}
		}

			
	}

}
