import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-stdin-stdout
 */
public class StdinStdout2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        double y = Double.parseDouble(sc.nextLine());
        String s = sc.nextLine(); // grab the whole line of input

        System.out.println("String: "+s);
        System.out.println("Double: "+y);
        System.out.println("Int: "+x);

        // why the casts to int and double above? the nextint and nextdouble methods don't read in newlines, so those
        // are left over for the nextline method to consume. So, you can either throw in extra nextline calls to eat up
        // those newlines so you can get to actual input, or you can just use nextline each time and cast the result to
        // the right type, as nextline consumes newlines as well.
        // http://stackoverflow.com/questions/13102045/skipping-nextline-after-using-next-nextint-or-other-nextfoo-methods
    }
}
