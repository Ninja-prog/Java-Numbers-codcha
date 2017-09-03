// Sexy Primes - are prime numbers that differ from each other by 6.
// Problem: Write a programm which will print all sexy primes up to given number.
package core;
import java.util.*;

public class SexyPrimes {
	public static boolean isPrime(int number) {
		if (number <= 1) {return false;}
		if (number == 2) {return true;}
		if (number % 2 == 0) {return false;}
		for (int i = 2; i < number; i++) {if (number % i == 0) {return false;}}
		return true;
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt(); input.close();
		System.out.print("Sexy primes are: ");
		for(int i =1; i <= number; i++) {
			if(isPrime(i) && isPrime(i + 6)) {
				System.out.print("(" + i +  " " + (i + 6) + "), ");
			}
		}
	}
}
