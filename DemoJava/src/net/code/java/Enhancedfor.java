/**
 * 
 */
package net.code.java;

import java.util.Random;

/**
 * @author LIONS
 *
 */
class Enhancedfor 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Random r = new Random() ; 
		
		int [] nums = new int [10]; 
		
		for (int i=0;i<10;i++)
		{
			nums[i] = r.nextInt(50);
		}
		
		/*
		 * for( int i =0; i <nums.length;i++) { System.out.println(nums[i]); }
		 */
		
		for( int n : nums) {
			System.out.print (n + " ");
		}
		
		// Two deimension array and using the enhanced for loop 
		
		int p [][] ={
						{ 4,5,6,7,8},
						{ 1,2,3,4,5},
						{ 5,7,8,9,3}
					} ; 
		
					
		System.out.println("\n ");		 
		
		for(int i =0; i < 3 ; i++) 
		{   
			for(int j=0;j<5;j++)
			{
				System.out.print( p[i][j] + " " );
			}
			System.out.println(" ");
		}
	
		// using the enhanced for loop 
		System.out.println(" ");
		for(int i []: p) 
		{
			for(int j : i ) 
			{
				System.out.print(j + " "); 
			}
			System.out.println(" ");
		}
		
		
		
		
		
	}

}
