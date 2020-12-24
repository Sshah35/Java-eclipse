package net.code.java;

import java.util.Random;

public class Myarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// # 3 Types of array 1 dimension , 2 dimension, 3 dimensions

		int a[] = new int[5];

		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// This is the Enhanced For Loops Only Drab back is it will give all the values

		int val[] = { 1, 2, 3, 4, 5, 6 };

		for (int i : val) {
			System.out.print(i + " ");
		}

		// using the Random to assign the values
		Random r = new Random();

		int b[] = new int[20];

		for (int i = 0; i < b.length; i++) {
			b[i] = r.nextInt(20);
		}

		for (int i :b) {
			System.out.println(i + " ");
			System.out.println(" ");
		}
		
		// Multi dimensions Arrays 
		
		int x [] = { 4,5,6,7,8};
		int y [] = { 1,2,3,4,5};
		int z [] = { 5,7,8,9,3}; 
		
		int p [][] ={
						{ 4,5,6,7,8},
						{ 1,2,3,4,5},
						{ 5,7,8,9,3}
					} ; 
		
					
	    for(int i =0; i<z.length ; i++) 
	    { 
	    	System.out.print (z[i]  +" ");
	    }
		System.out.println("\n ");		 
		
		for(int i =0; i < 3 ; i++) 
		{   
			for(int j=0;j<5;j++)
			{
				System.out.print( p[i][j] + " " );
			}
			System.out.println(" ");
		}
	
		// using the Enhanced for loop ... 
		// using the enhanced for loop 
		System.out.println(" ");
		
		System.out.println("\tUsing the Enhanced for loop \n ");
		
		for(int i []: p) 
		{
			for(int j : i ) 
			{
				System.out.print(j + " "); 
			}
			System.out.println(" ");
		}
		
		System.out.println("\n\tUsing The Jaged array different size of Rows and Colums \n ");
		
		int  jag[][] ={
						{ 4,5,6,7,8},
						{ 1,2,3},
						{ 5,7,8,9,3}
					} ; 

		
		for(int i []: jag) 
		{
			for(int j : i ) 
			{
				System.out.print(j + " "); 
			}
			System.out.println(" ");
		}
		System.out.println("\n\tUsing The Multidimensional array"
				            + " 3d dimensios Rows and Colums \n ");	
		
		
		int a1[]= new int [5];
		int b1[][]= new int[4] [4];
		
		
		//this is the 3 dimension 
		int c1[][][]= new int [4][4][4];
		
		for(int i= 0;i<4;i++) 
		{
			for(int j=0 ; j<4; j++ ) 
			{		
				for(int k=0;k<4;k++ ) 
				{
					c1[i][j][k]= i+j+k ; 
					
				}
				
			}
			System.out.println(" ");
		}
		
		for(int i= 0;i<4;i++) 
		{
			for(int j=0 ; j<4; j++ ) 
			{		
				for(int k=0;k<4;k++ ) 
				{
					
					System.out.println(" " + c1 [i][j] [k]);
					
				}
				
			}
			
		}	
		
		
		
		
	}

}
