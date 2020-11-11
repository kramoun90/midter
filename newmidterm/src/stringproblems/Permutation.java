package stringproblems;


/**
 * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
 *
 * this method will check Permutation of a String
 *
 * Author: ALAEDDINE Kramou
 * date: 10/06/2020
 */

public class Permutation {
    public static void main(String[] args) {
        PermutationString(str, " ");
    }
    static String str = "ABC";

    static void PermutationString(String name1,String name2){

        if (name1.length() == 0){
            System.out.print(name2 + " ");
            return;
        }
        boolean index[]=new boolean[4];
        for (int i=0;i<name1.length();i++  ){
            char alphabet = name1.charAt(i);
            String character = name1.substring(0,i)+name1.substring(i+1);
            if (index[alphabet-'A']== false)
                PermutationString(character,name2 + alphabet);
            index[alphabet-'A'] = true;
        }
    }
}
