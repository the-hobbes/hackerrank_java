import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-end-of-file
 */
public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 0;
        while (sc.hasNext()) {
            System.out.printf("%d %s \n", counter + 1, sc.nextLine());
            counter++;
        }
    }
}
