// PALINDROME number is a number that is same after reverse
package core;
import java.util.Scanner;

public class PalindromeNumbers {
 
      public static void main(String[] args) {
            System.out.print("Enter a number:  ");
            Scanner input = new Scanner(System.in);
            int number1 = input.nextInt(); input.close();
           
      // Start coding
    int number = number1;
    int reverse = 0;
    int origin = number;
    
    while (number > 0)  {
        reverse = reverse * 10 + number % 10;
        number = number / 10;   }
    if (origin == reverse) System.out.println(origin + " is palindrome number ");
    else                            System.out.println(origin + " is not palindrome number ");
    
        // End coding 
      }
}