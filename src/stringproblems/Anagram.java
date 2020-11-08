package stringproblems;


import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.Arrays;

/**
 * Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
 * same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
 *
 *
 */
//
public class Anagram {

    public static void main(String[] args) {
        ChekAnagram("CAT", "ACT");
        ChekAnagram("ARMY", "MARY");
        ChekAnagram("MCA", "MAC");  //MCA IS MY FAVORITE FOOTBALL TEAM ;)
        ChekAnagram("night","thing");
        ChekAnagram("below", "elbow");
        ChekAnagram("study", "elbow");
        ChekAnagram("meal for one", "for me alone");
        ChekAnagram("video game", "give a demo");
        ChekAnagram("coins kept", "in pockets");


    }
    public static boolean ChekAnagram(String str1, String str2) {
        boolean Ordr = true;
        if (str1.length() != str2.length()) {
            Ordr = false;
        } else {
            char[] arraySt = str1.toLowerCase().toCharArray();
            char[] arrayDt = str2.toLowerCase().toCharArray();
            Arrays.sort(arraySt);
            Arrays.sort(arrayDt);
            Ordr = Arrays.equals(arraySt, arrayDt);
        }
        System.out.println(str1 + "," + str2 + "===>" + Ordr);
        return Ordr;
    }
}
