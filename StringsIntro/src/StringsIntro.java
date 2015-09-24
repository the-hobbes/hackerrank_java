import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-strings-introduction
 */
public class StringsIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        String b = sc.nextLine().trim();
        int totalLength = a.length() + b.length();
        // ternary expression format ==> boolean statement ? true result : false result;
        String aIsLarger = a.compareTo(b) > 0 ? "Yes" : "No";
        String combined = a.substring(0, 1).toUpperCase() + a.substring(1) +
                " " + b.substring(0, 1).toUpperCase() + b.substring(1);

        System.out.printf("%d\n%s\n%s\n", totalLength, aIsLarger, combined);
    }
}
