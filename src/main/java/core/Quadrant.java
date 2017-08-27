// PROBLEM: Write a program which accepts an angle and prints its quadrant.
// Example: 0-89=>1; 90-179=>2; 180-269=>3; 270-359=>4.
package core;
import java.util.Scanner;
public class Quadrant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an angle: ");
		int angle = input.nextInt(); input.close();
		int quadrant;
		
		quadrant = (angle / 90) % 4 + 1;
		System.out.println("Quadrant is: " + quadrant);
	}
}
