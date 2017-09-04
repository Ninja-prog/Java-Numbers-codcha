// ABUNDANT number - is a number which sum of its proper divisors is greater than number. 12 =>1+2+3+4+5+6= 18>12
// Problem: Write a program which will print Abundant numbers up to given number. 
package core;
import java.util.Scanner;

public class AbundantNumbers {
	public static boolean isAbundant(int number) {
		int temp = 0;
		for (int i = 1; i <= number / 2; i++) {if(number % i == 0){temp +=i;}}
												if(temp > number) {return true;}
												else {return false;}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt(); input.close();
		System.out.print("Abundant numbers are: ");
		for (int i = 1; i <= number; i++) {if(isAbundant(i)) {System.out.print(i + ", ");}}
	}
}
