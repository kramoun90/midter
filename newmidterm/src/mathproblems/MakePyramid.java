package mathproblems;

import java.util.Scanner;

/**
 * Autor: ALAEDDINE Kramou
 * date: 10/18/2020
 */
public class MakePyramid {
    public static void main(String[] args) {

        /*  Implement a large Pyramid of stars in the screen with java.
                          *
                         * *
                        * * *
                       * * * *
                      * * * * *
                     * * * * * *
         */
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Number ");
        int totalRows = num.nextInt();
        for (int i = 1; i <= (2 * totalRows - 1); i++) {
            if (i <= totalRows) {
                for (int j = 1; j <= (totalRows + i - 1); j++) {
                    if (j >= (totalRows - i + 1)) {
                        System.out.print("#  ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
        num.close();
    }
}