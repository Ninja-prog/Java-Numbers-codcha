// PROBLEM: Write the program which will check the given number is binary number or not.
package core;
import java.util.Scanner;

public class BinaryOrNot {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number 10 digits or less: ");
		while (!input.hasNextInt()) {
			System.out.println("That's not a number or more than 10 digits");
			input.next();}
		int number = input.nextInt(); input.close();
		String result = "binary";
		while (number != 0) {
			int temp = number % 10;			// Evaluating the last digit
			if (temp > 1) {result = "not binary"; break;}
			else {number = number / 10;}	// Removing the last digit
		}
		System.out.println(number + " is " + result);
	}
}
