import java.util.Scanner;
import java.math.BigDecimal;

/**
 * https://www.hackerrank.com/challenges/java-bigdecimal
 */
public class BigDecimalSolution {


    public static void main (String[] args) {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++) {
            s[i]=sc.next();
        }

        // cast, compare, and write back to s
        for(int i=0; i<n; i++) {

        }

        //Output
        for(int i=0;i<n;i++) {
            System.out.println(s[i]);
        }

    }
}
