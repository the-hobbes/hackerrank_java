import java.util.Arrays;
import java.util.Scanner;
import java.math.BigDecimal;

/**
 * https://www.hackerrank.com/challenges/java-bigdecimal
 */
public class BigDecimalSolution {

    public static BigDecimal[] BubbleSort(BigDecimal[] arr) {
        // reverse sorted order implementation of bubbleSort
        BigDecimal temp;
        for(int i=0; i < arr.length-1; i++){

            for(int j=1; j < arr.length-i; j++){
                if(arr[j-1].compareTo(arr[j]) == -1){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigDecimal []nums = new BigDecimal[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextBigDecimal();
        }

        BigDecimal []sorted = BubbleSort(nums);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i].toString());
        }
    }
}
