// Sort three numbers from small to big example: 10, 4, 25 => 4, 10, 25
package core;
import java.util.Scanner;

public class SortThree_Numbers {
      public static void main(String[] args) {
           
            Scanner input = new Scanner(System.in);
            System.out.print("Enter first number:  ");
            int a = input.nextInt();
            System.out.print("Enter second number:  ");
            int b = input.nextInt();
            System.out.print("Enter third number:  ");
            int c = input.nextInt(); input.close();
            System.out.print("Sorted numbers: ");
 
            // if ((a < b) && (b < c)) {System.out.println(a + " " + b + " " + c);} // 123
            // if ((a > b) && (b > c)) {System.out.println(c + " " + b + " " + a);} //321
            // if ((a < b) && (b > c) && (a < c)) {System.out.println(a + " " + c + " " + b);} // 465
            // if ((a > b) && (b < c) && (a < c)) {System.out.println(b + " " + a + " " + c);}  // 213
            // if ((a < b) && (b > c) && (a > c)) {System.out.println(c + " " + a + " " + b);} // 564
            // if ((a == b) && (b == c)) {System.out.println(a + " " + b + " " + c);} // 444
            
// Start coding
            if ((a < b) && (b < c)) {System.out.println(a + " " + b + " " + c);}
            if ((c < b) && (c > a)) {System.out.println(a + " " + c + " " + b);}
            if ((a > b) && (a < c)) {System.out.println(b + " " + a + " " + c);}
            if ((a > c) && (c > b)) {System.out.println(b + " " + c + " " + a);}
            if ((a < b) && (a > c)) {System.out.println(c + " " + a + " " + b);}
            if ((c < b) && (a > b)) {System.out.println(c + " " + b + " " + a);}
            if ((a == b) && (b == c)) {System.out.println(a + " " + b + " " + c);}
            
            if ((a == b) && (b > c)) {System.out.println(c + " " + a + " " + b);} // 155
            if ((a == c) && (c > b)) {System.out.println(b + " " + c + " " + a);} // 344
            if ((c == b) && (b > a)) {System.out.println(a + " " + b + " " + c);} // 277
            if ((a == b) && (b < c)) {System.out.println(b + " " + a + " " + c);} // 323
            if ((a == c) && (c < b)) {System.out.println(c + " " + a + " " + b);} // 242
            if ((c == b) && (b < a)) {System.out.println(b + " " + c + " " + a);} // 322 
//End coding
      }
}
 