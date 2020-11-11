package problemandsolutions;

import java.util.Scanner;

/**
 * Write Java program to allow the user to input two integer values and then the program prints the results of adding,
 *  subtracting, multiplying, and dividing among the two values.
 *
 *  Autor: ALAEDDINE Kramou
 *  date: 10/18/2020
 */

public class ArithmeticOperator {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("The first number : ");
        int inte1 = in.nextInt();
        System.out.print("The second number: ");
        int inte2 = in.nextInt();
        System.out.println("Result: "+result(inte1, inte2));
        in.close();
    }
    public static int result(int num1, int num2)
    {
        if(num1 == num2)
            return 0;
        if(num1 % 6 == num2 % 6)
            return (num1 < num2) ? num1 : num2;
        return (num1 > num2) ? num1 : num2;
    }



}