// Factorial function (symbol: !) means multiply a series of descending natural numbers.
package core;
import java.util.Scanner;

public class FactorialNumbers {
 
      public static void main(String[] args) {
    	  
    	System.out.print("Enter a number: ");
  		Scanner input = new Scanner(System.in);
  		int number1 = input.nextInt(); input.close();
  		System.out.print("Factorial of the number " + number1 + " is: ");
          
    int number = 6; // Factorial of given number 6
    for (int i = number - 1; i > 0; i--) {
        number = number * i;}
        System.out.print(number);
      }
}