import java.util.Scanner;

public class Inputs {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int value=0 ;
		do {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}
		
		while (value !=5);
		
			System.out.println(" I got the number ");
			
	}
	
}
