package mathproblems;

import java.util.Arrays;

/**
 * Implement in java.
 *Read this below two array. Find the lowest difference between the two array cell.
 *The lowest difference between cells is 1
 *
 * Autor: ALAEDDINE Kramou
 * date: 10/01/2020
 */
public class FindLowestDifference {
    public static void main(String[] args) {

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int num1 = array1.length;
        int num2 = array2.length;
        System.out.println("the lowest difference between array1 and array2 is : "+findSmallestDifference(array1, array2, num1, num2));
    }

    static int findSmallestDifference(int arr1[], int arr2[], int num1, int num2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int k = 0, j = 0;
        int diff = Integer.MAX_VALUE;
        while (k < num1 && j < num2) {
            if (Math.abs(arr1[k] - arr2[j]) < diff)
                diff = Math.abs(arr1[k] - arr2[j]);

            if (arr1[k] < arr2[j])
                k++;
            else
                j++;
        }
        return diff;
    }
}


