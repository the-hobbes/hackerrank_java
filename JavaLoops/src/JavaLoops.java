import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-loops
 */

public class JavaLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i=0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            computation(a, b, c);
        }
    }

    public static void computation(int a, int b, int c) {
//        System.out.printf("%d, %d, %d \n", a, b, c);

        int previous = 0;
        int res;
        for (double y=0.0; y < c; y++){
            int z = (int) Math.pow(2.0, y);
            if (previous == 0) {
                res = a + (z * b) + previous;
            }
            else{
                res = (z * b) + previous;
            }
            System.out.printf("%d ", res);
            previous = res;
        }
        System.out.println();
    }
}


