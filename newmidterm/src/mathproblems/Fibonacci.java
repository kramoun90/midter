package mathproblems;

import java.util.Scanner;

/**
 *Write 40 Fibonacci numbers with java.
 * 0,1,1,2,3,5,8,13
 *Autor: ALAEDDINE Kramou
 *date:10/18/2020
 */
public class Fibonacci {
    public static void main(String[] args) {

        int num1=0,num2=1,num3=1 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ");
        int num4 = scan.nextInt();
        System.out.print("1 1 ");
        while (num1 <= num4){
            num1 = num2+num3;
            if (num1 <= num4){
                System.out.print(num1 + " ");
                num2 = num3;
                num3 = num1;
            }
        }

    }
}