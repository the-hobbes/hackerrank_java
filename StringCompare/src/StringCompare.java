import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-compare
 */
public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputString = sc.nextLine().trim();
        int k = sc.nextInt();
        String largest = inputString.substring(0, k);
        String smallest = inputString.substring(0, k);

        // iterate over the string from 0 to length-k-1 and compare lexigraphical value of the substrings
        for (int i = 0; i < inputString.length() - (k - 1); i++) {
            String s = inputString.substring(i, i + k);
            if (s.compareTo(largest) > 0) {
                largest = s;
            }
            if (s.compareTo(smallest) < 0) {
                smallest = s;
            }
        }

        System.out.printf("%s\n%s \n", smallest, largest);
    }
}
