// Write a program which calculates the sum of all given numbers.
package core;
import java.util.Scanner;
public class SumOfDigits {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a number: ");
		long number = input.nextLong(); input.close();
		long sum = 0;
		for ( int i = 0; i < String.valueOf(number).length(); ++i) {
			sum += Integer.parseInt(String.valueOf(number).substring(i, i + 1));}
		System.out.println("Sum is: " + sum);
		}
	}
