import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-reverse
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine().trim();

        String reversed = new StringBuilder(inputString).reverse().toString();
        if (inputString.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
