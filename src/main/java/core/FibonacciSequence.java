// FIBONACCI sequence of numbers (in modern usage start with 0), each number is the sum of the previous two.
package core;
import java.math.BigInteger;
import java.util.Scanner;
 
public class FibonacciSequence {
 
      public static void main(String[] args) {
 
            System.out.print("Enter the length of the Fibonacci series: ");
            Scanner sc = new Scanner(System.in);
            sc.nextInt(); sc.close();
            System.out.print("Fibonacci series are: ");

        int max = 100;
        BigInteger fibonacci = BigInteger.ZERO;
        BigInteger fibonacci2 = BigInteger.ONE;
        for (int i = 1; i < max; i++) {System.out.println(i + ": " + fibonacci);
            fibonacci = fibonacci.add(fibonacci2);
            fibonacci2 = fibonacci.subtract(fibonacci2);
        	}
      }
}