import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-1d-array-easy
 */
public class Java1dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] intList = new int[n];
        String[] strList = sc.nextLine().trim().split(" ");
        int sum = 0;

        for (int i = 0; i < strList.length; i++) {
            intList[i] = Integer.parseInt(strList[i]);
        }

        for (int i = 0; i < intList.length; i++) {
            int runningSum = 0;
            for (int j = i + 1; j < intList.length; j++) {
                // System.out.println(i + ":" + j);
                runningSum += intList[i];
            }
            if (runningSum <0 ) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
