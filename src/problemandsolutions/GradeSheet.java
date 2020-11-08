package problemandsolutions;

import java.util.Scanner;

public class GradeSheet {
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.


    public static void main(String[] args) {
        Scores();
    }

    static void Scores() {

        int quiz_score;
        int mid_score;
        int final_score;
        int avg;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter you quiz score:");
        quiz_score = obj.nextInt();
        System.out.print("Enter your Mid-term score:");
        mid_score = obj.nextInt();
        System.out.print("Enter your Final score:");
        final_score = obj.nextInt();
        avg = (quiz_score + mid_score + final_score) / 3;

        if (avg >= 90) System.out.println("Your grade A.");
        else if ((avg >= 70) && (avg < 90)) System.out.println("Your grade B.");
        else if ((avg >= 50) && (avg < 70)) System.out.println("Your grade C.");
        else if (avg < 50) System.out.println("Your grade F.");
        else System.out.println("Invalid");


    }

}

