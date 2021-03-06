// Problem: Write a program which accepts a octal number and converts it to decimal.
package core;
import java.util.Scanner;

public class Octal2Decimal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an Octal number: ");
		String octal = input.nextLine(); input.close();
		
		if(!octal.matches("^[0-7]+$")) {System.err.println("Not an octal"); System.exit(0);}		// Error Handling
		if(octal.length() > 19) {System.err.println("Supports only 19 digits"); System.exit(0);}	// Error Handling
		
	 // System.out.println("Decimal: " + Integer.parseInt(octal, 8));	// Not on the interview
		Long oct = Long.valueOf(octal);
		int decimal = 0; int power = 0;
		while (oct > 0) {decimal += oct % 10 * Math.pow(8, power); oct = oct / 10; power++;}
		System.out.println("Decimal: " + decimal);
	}
}
