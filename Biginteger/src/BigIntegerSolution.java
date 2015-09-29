import java.util.Scanner;
import java.math.BigInteger;

/**
 * https://www.hackerrank.com/challenges/java-biginteger
 */
public class BigIntegerSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger number1 = sc.nextBigInteger();
        BigInteger number2 = sc.nextBigInteger();

        System.out.println(number1.add(number2));
        System.out.println(number1.multiply(number2));
    }
}
