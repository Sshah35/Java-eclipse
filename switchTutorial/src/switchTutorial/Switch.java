package switchTutorial;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println(" Please enter a command");
		String text = input.nextLine();
		
		switch(text) {
		case "start":
			System.out.println("Staring Now");
			break;
			
		case "stop":
			System.out.println("Stopping it");
			break;
			
		default: 
			System.out.println("Command not Recognizes:");
			
			
		
		}
		
		
		
		
	}

}
