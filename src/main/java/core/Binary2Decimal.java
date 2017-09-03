// Problem: write a program which accepts a binary number and convert it to decimal.
package core;
import java.util.Scanner;

public class Binary2Decimal {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary number: ");
		String binary = input.nextLine(); input.close();
		
		if(!binary.matches("^[01]+$")) {System.err.println("Not a binary"); System.exit(0);}		// Error Handling
		if(binary.length() > 19) {System.err.println("Suupports only 19 digits"); System.exit(0);}	// Error Handling
		
	 // System.out.println("Decimal: " + Integer.parseInt(binary,2));  // Not on the interview
		Long bin = Long.valueOf(binary);
		int decimal = 0; int power = 0;
		while(bin > 0) {decimal += bin % 10 * Math.pow(2, power); bin = bin / 10; power++;}
		System.out.println("Decimal: " + decimal);
	}
}
