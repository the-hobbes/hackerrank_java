import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-regex
 */

/**
 * myRegex
 * Contains a string pattern.
 * You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP
 * address. Use the following definition of an IP address:
 *
 * IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading
 * zeros are allowed. The length of A, B, C, or D can't be greater than 3.
 */
class myRegex {
    // http://www.mkyong.com/regular-expressions/how-to-validate-ip-address-with-regular-expression/
    String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
}

public class StringRegex {

    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }
    }
}
