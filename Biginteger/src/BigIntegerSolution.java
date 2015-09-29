import java.util.Scanner;
java.math.BigInteger;

/**
 * https://www.hackerrank.com/challenges/java-biginteger
 */
public class BigIntegerSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.math.BigInteger number1 = sc.nextBigInteger();
        java.math.BigInteger number2 = sc.nextBigInteger();

        System.out.println(number1.add(number2));
        System.out.println(number1.multiply(number2));
    }
}
