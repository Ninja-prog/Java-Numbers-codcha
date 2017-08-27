/* Write a program which takes "N" amount of numbers (positive and negative)
and find out the average of positive and negative numbers.
*/
package core;
import java.util.Scanner;

public class Average {
 
      public static void main(String[] args) throws Exception{
            int[]arr = new int [4]; //change this, to print out desirable amount numbers
 
            double avg_pos = 0.0, avg_neg = 0.0;
            Scanner scan = new Scanner(System.in);
            for(int i = 0; i < 4; i++) {
            System.out.println("Enter Number [" + i + "]:");
            arr[i] = scan.nextInt();}
            scan.close();
           
            // Start coding
            int pos_count = 0, neg_count = 0, positive = 0, negative = 0;
            for (int number : arr) {
                if(number > 0) {positive += number; pos_count++;}
                else if (number < 0) {negative += number; neg_count++;}
            }
            avg_pos = (double)positive / pos_count;
            avg_neg = (double)negative / neg_count;
        // End coding
        System.out.println("Positive avarage: " + avg_pos);
            System.out.println("Negative avarage: " + avg_neg);
      }
}