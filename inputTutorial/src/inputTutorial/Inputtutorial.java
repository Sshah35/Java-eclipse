package inputTutorial;

import java.util.Scanner;

public class Inputtutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the line of text :" );
		
		String line = input.nextLine();
		System.out.print(" You Entered following line: " + line);		
		
		
		
		System.out.print("\nEnter the desired value :");
		
		int value = input.nextInt();
		
		System.out.print(" You Entered following values: " + value);

	}

}
