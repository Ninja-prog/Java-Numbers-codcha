// Summary of Odd Numbers (Example: 10 => 25 (1+3+5+7+9))
package core;
import java.util.Scanner;

public class SumOddNumbers {
      public static void main(String[] args) {
 
            // Start coding
 
        long max = 0;
        long sum = 0;
        System.out.println("Enter Maximum number:");
        Scanner sc = new Scanner (System.in);
        max = sc.nextInt(); sc.close();
        for (int i = 0; i <= max; i++) {if (i % 2 != 0) {sum += i;}}
        System.out.print("Sum of odd numbers: " + sum);
 
        // End coding
      }
}
