// PRIME NUMBER is a number (positive only) which only divisible by 1 and itself.
package core;
 
public class PrimeNumbers {
 
	public static boolean isPrime(int prime_number) {
		if (prime_number <= 1) return false;
		if (prime_number == 2) return true;
		if (prime_number % 2 == 0) return false;
		for (int i = 2; i < prime_number; i++) {
			if (prime_number % i == 0) return false;}
        	return true;
        	}
	public static void main (String [] args) {
      int max = 50; 
      for (int i = 1; i <= max; i++) {
            if (isPrime(i)) {System.out.print(i + ", "); }
            }
        }
}

