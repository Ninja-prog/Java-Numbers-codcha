// PALINDROME is a number that is same after reverse.
//PROBLEM: Write a program which will check the given number is palindrome or not.
package core;
import java.util.Scanner;
public class Palindrome {
	
	public static void main(String[] args) {
	System.out.print("Enter a number: ");
	Scanner input = new Scanner (System.in);
	int number = input.nextInt(); input.close();
	
	int reverse = 0 ;
	int origin = number;
	while (number > 0) {
		reverse = reverse * 10 + number % 10;
		number = number / 10;}
	if (origin == reverse) {System.out.print(origin + " is palindrome number");}
	else {System.out.println(origin + " is not palindrome number");}
	}
}
