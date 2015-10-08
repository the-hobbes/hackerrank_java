import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-1d-array
 */

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] intList = new int[n];
            for (int j=0; j<n; j++){
                intList[j] = sc.nextInt();
            }
            System.out.println(Arrays.toString(intList));
        }
    }
}
