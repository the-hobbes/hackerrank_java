import java.util.Scanner;
import java.math.BigDecimal;

/**
 * https://www.hackerrank.com/challenges/java-bigdecimal
 */

public class BigDecimalSolution {

    public static void main(String[] args) {
        // setup variables
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n+2];

        // read in input
        for(int i=0;i<n;i++) {
            s[i] = sc.next();
        }

        for(int i=0;i<n;i++) {
            int index =i;

            // compare the value at [index] to the rest of the values in the string array
            for(int j=i+1;j<n;j++) {
                BigDecimal bi2 = new BigDecimal(s[j]); // casting each to a BigDecimal
                BigDecimal bi3 = new BigDecimal(s[index]);

                // 0 means == in compareTo(), 1 is > than
                if(bi2.compareTo(bi3)>0)
                    index =j;
            }
            String smallerNumber = s[index];
            s[index] =s[i];
            s[i] = smallerNumber;
        }
        for(int i=0;i<n;i++) {
            System.out.println(s[i]);
        }
    }
}
