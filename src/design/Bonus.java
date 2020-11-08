package design;
//import Scanner as we require it.
import java.util.Scanner;

// the name of our class its public
public class Bonus {
    //void main
    public static void main (String[] args)
    {
//declare int and char
        int a,b;
        char c;

//Declare input as scanner
        Scanner input = new Scanner(System.in);

//Take inputs
        System.out.println("Enter Salary");
        a = input.nextInt();
        System.out.println("Enter Gender:");
        String g = input.next();
        char d[] = g.toCharArray();
        c = d[0];
//if-else statement
        if(c=='f')
        {
            b=(a*10)/100;
            System.out.println("Bonus Applicable :"+b);
        }
        else
        {
            if(c=='m')
            {
                b=(a*5)/100;
                System.out.println("Bonus Applicable :"+b);
            }
            else
                System.out.println("Invalid gender");
        }

    }
}