import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-compare
 */
public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputString = sc.nextLine().trim();
        int k = sc.nextInt();
        String largest = inputString.substring(0, 3);
        String smallest = inputString.substring(0, 3);

        // iterate over the string from 0 to length-3 and compare lexigraphical value of the substrings
        for (int i = 0; i < inputString.length() - 3; i++) {
            String s = inputString.substring(i, i + 3);
            System.out.println(s);
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
