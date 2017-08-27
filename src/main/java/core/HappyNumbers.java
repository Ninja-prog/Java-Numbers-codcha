/* HAPPY NUMBER is a positive integer, replace the number by the sum of the squares of its digits,
and repeat the process until the number equals 1, if it loops endlessly its called UNHAPPY NUMBER.
*/
package core;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class HappyNumbers {
	public static boolean isHappy(int number) {
		Set<Integer> unique = new HashSet<Integer>(); //Set remove duplicates, List has duplicates
		while (unique.add(number)) {int value = 0;
		while(number > 0) {value += Math.pow(number % 10, 2); 
		number /= 10;}
		number = value;}
		return number == 1;}
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int number = input.nextInt(); input.close();
			System.out.print(number + " is ");
			System.out.print(isHappy(number) ? "Happy number" : "Unhappy number");
		}
	}