//Problem: Write a program which accepts a decimal number and converts it to hexadecimal.
package core;
import java.util.Scanner;
public class Decimal2Hexadecimal {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive decimal: ");
		int decimal = Math.abs(input.nextInt()); input.close();
		String hexadecimal = "";
		String hexadecimals = "0123456789absdef";
	 // System.out.println("hex: " + Integer.toHexString(decimal));		// Not on the interview
	 // System.out.println("hex: " + Integer.toString(decimal,16));		// Not on the interview
		while (decimal > 0) {hexadecimal = hexadecimals.charAt(decimal % 16) + hexadecimal;
								decimal = decimal / 16;}
		System.out.println("Hex: " + hexadecimal);
	}
}
