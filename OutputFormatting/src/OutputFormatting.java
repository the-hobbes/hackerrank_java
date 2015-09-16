/**
 * https://www.hackerrank.com/challenges/java-output-formatting
 */

import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1 = sc.next(); // default delimeter is spaces
            int x = sc.nextInt();
            // ''%-14s'' means fourteen characters, left-justified (omit "-" for right justified)
            // %03d means pad with 0's to the left of the integer if it isn't 3 characters
            // %n gives a new line
            System.out.printf("%-14s %03d \n", s1.trim(), x);

            // we use 14 because there is an extra space between the string and integer in the input.
        }
        System.out.println("================================");
    }
}
