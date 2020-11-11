package problemandsolutions;

import java.util.Random;

/**
 * Write Java program to generate a random number between 1 to 8.
 *
 * Autor: ALAEDDINE Kramou
 * date: 10/18/2020
 */
public class RandomNumberGenerate {


    public static void main(String[] args) {
        Random rn = new Random();
        for(int i =0; i < 10; i++)
        {
            int answer = rn.nextInt(10) + 1;
            System.out.println(answer);
        }



    }
}

