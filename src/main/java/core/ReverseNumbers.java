// Problem: Write a program which accepts a number and print its reverse numbers. 12345 => 54321
package core;

public class ReverseNumbers {				// using Reverse String
	public static void main(String[] args) {		
		int number = 12345; 
		String result = "";
		String num = String.valueOf(number);
		for(int i = num.length() - 1; i >= 0; i--) {result = result + num.charAt(i);}
		int reverse = Integer.parseInt(result);
		System.out.println(number + " : " + reverse);
	}
}

/*
public class ReverseNumbers { 				// using Reverse Integer
	public static void main(String[] args) {		
		int number = 12345; int reverse = 0;
		while (number != 0) {reverse = reverse * 10;
							reverse = reverse + number % 10; number = number / 10;}
		number = 12345;
	System.out.println(number + " : " + reverse);
	}
}
*/

/*
public class ReverseNumbers {				// using StringBuffer. Built-in method
	public static void main(String[] args) {		
		int number = 12345; int original = number; 
		StringBuffer string_buffer = new StringBuffer(String.valueOf(number));
		string_buffer.reverse();
		int reverse = Integer.parseInt(string_buffer.toString());
		System.out.println(original + " : " + reverse);
	}
}
*/