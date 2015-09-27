import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-token
 */
public class StringTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = "";
        try {
            inputString = sc.nextLine().trim();
        } catch (java.util.NoSuchElementException e) {
        }

        if (inputString.length() <= 400000 && inputString.length() > 0) {
            String wordDefinition = "[ !,?.'@_]+";
            String[] tokens= inputString.split(wordDefinition);

            System.out.println(tokens.length);
            for (int i = 0; i < tokens.length; i++) {
                System.out.println(tokens[i]);
            }
        } else {
            System.out.println(0); // catch empty string
        }
    }
}
