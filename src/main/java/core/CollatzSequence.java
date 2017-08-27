//Write the program which will print out Collatz (Ulam, Hailstone) sequence up to given number - 25
package core;
import java.util.Scanner;
public class CollatzSequence {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt(); input.close();
		String result = String.valueOf(number);		 // if ((number & 1) == 0) => even
		while (number > 1) {if (number % 2 == 0) {number = number / 2;}
							else {number = number * 3 + 1;}
		  result += String.valueOf(" " + number);} 			//result += " " + number;} //=> toString
		System.out.print("Collatz Sequence is: " + result);
	}
}