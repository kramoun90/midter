package problemandsolutions;

import java.util.Scanner;

/**
 *  By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.
 *
 * Autor: ALAEDDINE Kramou
 * date: 10/18/2020
 */
public class ArraySort {

    public static void main(String[] args) {
        int count, temp;

        //User inputs the array size
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the array: ");
        count = scan.nextInt();

        int num[] = new int[count];
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++) {
            num[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < count - 1; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[count - 1]);
    }
}
