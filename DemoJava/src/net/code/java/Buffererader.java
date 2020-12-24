/**
 * 
 */
package net.code.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author LIONS
 *
 */
public class Buffererader {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub  
		// You could also use the same thing to get the input for the file 
		System.out.print (" Enter a Number :");
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is) ; 
		int n = Integer.parseInt( br.readLine()); 
		
		System.out.println(n);
		
		String str = "";
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print(" Enter the information: ");
			str= sc.nextLine();
		} 
		System.out.println(str);
		

	}

}
