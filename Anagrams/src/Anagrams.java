import java.util.HashMap;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-anagrams
 */
public class Anagrams {

    /**
     * characterCount()
     * Uses a hashmap to track characters and their number of occurrences.
     * @param inputString, a string to break into a character-to-int hashmap.
     */
    private static HashMap<Character, Integer> characterCount(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if(charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c)+1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        return charCountMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine().trim().toLowerCase();
        String string2 = sc.nextLine().trim().toLowerCase();
        if ( characterCount(string1).equals(characterCount(string2)) ) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
