// Prime Factors of a positive integer are the prime numbers that divide that integer exactly.
// Problem: Write a program which accepts a number and print out its prime factors.
package core;
import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	long number = input.nextLong(); input.close();
	System.out.print("Prime factors are: ");
	
	for(int i = 2; i <= number; i++) {
		while(number % i == 0) {System.out.print(i + ", ");
				number /= i;
			}
		}
	}
}
