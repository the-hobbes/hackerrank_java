/**
 * https://www.hackerrank.com/challenges/java-stdin-and-stdout-1
 *
 * Sending input to a java program can be accomplished by piping. EG:
 * 1) build:
 *      javac StdinStdout.java
 * 2) pipe:
 *      cat input.txt | java StdinStdout
 * or for efficiency:
 *      javac StdinStdout.java ; cat input.txt | java StdinStdout
 */

import java.util.*;

public class StdinStdout {

    public static void main(String []argv) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
