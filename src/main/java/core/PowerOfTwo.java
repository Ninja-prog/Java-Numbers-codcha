//Write a program which will check the given number is power of two or not.Ex: 1,2,4,8,16,32,64,128,256,512,1024,4096,etc
package core;
import java.util.Scanner;
public class PowerOfTwo {
		public static boolean isPowerOfTwo(int number) {
			return (number != 0) && ((number & (number -1)) == 0);}
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int number = input.nextInt(); input.close();
	System.out.println(number + " is " + (isPowerOfTwo(number) ? "power of two" : "not power of two"));
	}

}
