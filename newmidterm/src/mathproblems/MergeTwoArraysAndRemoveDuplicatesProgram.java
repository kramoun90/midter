package mathproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeTwoArraysAndRemoveDuplicatesProgram {

    /**
     * Merge Two Arrays Into Single Sorted Array Without Duplicates
     *     given  arrayA={1,3,4}
     *     given  arrayB={4,5,6,7,8}
     *     output {1,3,4,5,6,7,8}
     *
     *Autor: ALAEDDINE Kramou
     * date: 10/18/2020
     *
     *
     */

    public static void main(String[] args) {
        // Array A
        Set<Integer> A = new HashSet<Integer>();
        A.addAll(Arrays.asList(new Integer[]{1, 3, 4}));
        // Array B
        Set<Integer> B = new HashSet<Integer>();
        B.addAll(Arrays.asList(new Integer[]{4, 6, 7, 8}));
        //Merge THE Two Arrays Into Single Sorted Array Without Duplicates
        Set<Integer> union = new HashSet<>(A);
        union.addAll(B);
        System.out.println("Union of two Set " + union);
    }
}

