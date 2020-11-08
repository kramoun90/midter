package problemandsolutions;

import java.util.Arrays;

public class SearchElementOfArray {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.


    public static void main(String[] args) {
        int rows= 10;
        int columns = 10;

        int iris [][]= new int[10][10];
        int[]counts=new int[10];
        for(int row=0;row<rows; row++){
            for(int col=0;col<columns; col++){
                int timesTen=(int)Math.round(10*iris[row][col]);
                counts[timesTen]++;

            }
            System.out.println(counts[row]);
        }
        System.out.println("The counts are\n"+ Arrays.toString(counts));

    }
}
