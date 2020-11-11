package mathproblems;

import java.util.Scanner;

/**
 * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
 * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
 * Autor: ALAEDDINE Kramou
 *date : 10/18/2020
 */
public class Factorial {

    public static void main(String[] args) {

        //Scanner object for capturing the user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        //Stored the entered value in variable
        int num = scanner.nextInt();
        //Called the user defined function fact
        int factorial = fact(num);
        System.out.println("Recursion Factorial of " + num + " IS: "+factorial);


        //We will find the factorial of this number
        int number = 5;
        long factorial1 = 1;
        int i = 1;
        while (i <= number) {
            factorial1 = factorial1 * i;
            i++;
        }
        System.out.println("Iteration Factorial of " + number + " IS: " + factorial);
        scanner.close();
    }

    static int fact(int n) {
        int output;
        if (n == 1) {
            return 1;
        }
        //Recursion: Function calling itself!!
        output = fact(n - 1) * n;
        return output;
    }

}
