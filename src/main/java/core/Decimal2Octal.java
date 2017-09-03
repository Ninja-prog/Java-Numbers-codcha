// Problem: Write a program which accepts a decimal number and converts it to octal.
package core;
import java.util.Scanner;
public class Decimal2Octal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive decimal number: ");
		int decimal = Math.abs(input.nextInt()); input.close();
		String octal = "";
		String octals = "01234567";
		// System.out.print("Octal: " + Integer.toOctalString(decimal)); // Not on interview
		// System.out.print("Octal: " + Integer.toString(decimal, 8));	 // Not on interview
		while (decimal > 0) {octal = octals.charAt(decimal %8) + octal;
							decimal = decimal /8;}
		System.out.println("Octal: " + octal);
	}
}
