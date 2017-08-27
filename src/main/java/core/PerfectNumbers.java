// PERFECT NUMBER is a positive integer that is equal to the sum of its proper divisors (6 => 1+2+3).
package core;
import java.util.Scanner;
 
public class PerfectNumbers {
	
    public static boolean isPerfectNumber(int perfect_number) {
            int temp = 0;
            for (int i = 1; i <= perfect_number / 2; i++) {
            if (perfect_number % i == 0) {temp += i;}}
            if (temp == perfect_number) {return true;}
            else {return false;}
            }
    
    public static void main(String[] args) {
 
            System.out.print("Enter a number:  ");
            Scanner input = new Scanner(System.in);
            input.nextInt(); input.close();
            System.out.print("Perfect numbers are: ");
           
            int max = 10_000;
            for (int i = 1; i <= max; i++) {
                  if (isPerfectNumber(i)) {System.out.print(i + ", ");}}
    	}
}
 