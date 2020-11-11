package stringproblems;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *Implement to Find the length and longest word in the given sentence below.
 *          Should return "10 biological".
 *
 * Autor: ALAEDDINE Kramou
 * date: 10/18/2020
 */
public class DetermineLargestWord {
    static  String str = "Human brain is a biological learning machine";
    public static void main(String[] args) {
        /*

         */
        String s ="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);

        System.out.println("Word length from the given sentence is "+wordNLength);
        System.out.println("Largest word from the given sentence is "+largestWord(s));

    }

    public static Map<Integer, String> findTheLargestWord(String givenWord){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";

        String[] sep = givenWord.split(" ");

        for (int i = 0; i < sep.length; i++) {
            map.put(sep[i].length(), sep[i]);
        }
        return map;
    }

    public static String largestWord(String givenWord) {
        DetermineLargestWord dt = new DetermineLargestWord();
        Map<Integer, String> wordNLength = dt.findTheLargestWord(givenWord);
        int largest = 0;
        String largeValue = "";
        for (Map.Entry<Integer, String> checkLength : wordNLength.entrySet()) {
            if (largest < checkLength.getKey()) {
                largest = checkLength.getKey();
                largeValue = checkLength.getValue();
            }
        }
        return largeValue;
    }
}