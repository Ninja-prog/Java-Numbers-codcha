/*EVEN NUMBER is an integer (positive or negative, not a fraction, including 0),
 which is divisible by 2.
*/
package core;
public class EvenNumbers { 
      public static void main(String[] args) {
        int max = 10;
            for (int i = 0; i <= max; i++) {
            if (i % 2 == 0) {System.out.print (i + ", ");}
            }
      }
}