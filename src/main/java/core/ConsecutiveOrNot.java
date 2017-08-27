// PROBLEM: Write a program which will check the given number is consecutive or not.
package core;
import java.util.*;
public class ConsecutiveOrNot {
	public static boolean isConsecutive(int...number) {
		if(numbers[i] < numbers[i + 1]) {if (numbers[i] + 1 != numbers[i + 1]) {return false;}}
		else if(numbers[i] > numbers[i + 1]) {if (numbers[i] - 1 != numbers[i + 1]) {return false;}}
	 return true;}

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = input.nextInt(); input.close();
	System.out.print(number + " is ");
	int[] numbers = new int[String.valueOf(number).length()];
	int i = String.valueOf(number).length() - 1;
	while(number > 0) {numbers[i] = number % 10; number /= 10; i--;};
	System.out.print(isConsecutive(numbers) ? "consecutive" : "no consecutive");
		}
	}
