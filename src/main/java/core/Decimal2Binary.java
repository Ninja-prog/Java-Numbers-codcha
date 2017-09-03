// Problem: Write a program which accepts a decimal number and converts it to binary.
package core;
import java.util.Scanner;
public class Decimal2Binary {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int decimal = Math.abs(input.nextInt()); input.close(); // Math.abs return absolute (positive) value (-1) => 1
		String binary = "";
		// System.out.println("Binary: " + Integer.toBinaryString(decimal)); // Do not use on interview
		// System.out.println("Binary: " + Integer.toString(decimal,2));     // Do not use on interview
		
		while (decimal > 0) {binary = (decimal % 2) + binary;
		decimal = decimal / 2;}
		System.out.println("Binary: " + binary);
		}
	}