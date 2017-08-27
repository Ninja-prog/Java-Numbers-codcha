// LEAP YEAR is containing 366 day (February 29), divisible by 4 and 400, but not by 100.
// PROBLEM: Write a program which will check the given year is leap or not?
package core;
import java.util.Scanner;
public class LeapYear {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt(); input.close();
		if(String.valueOf(year).length() != 4) {System.out.println("Invalid year"); System.exit(0);}
		System.out.print(year + " is ");
		if ((year > 1582) && (year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0))
		{System.out.println("a leap year");}
		else {System.out.println("not a leap year");}
	}
}
