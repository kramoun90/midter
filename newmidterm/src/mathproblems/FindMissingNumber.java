package mathproblems;

/**
 *If n = 10, then array will have 9 elements in the range from 1 to 10.
 * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
 * Write java code to find the missing number from the array. Write static helper method to find it.
 *
 *Autor: ALAEDDINE Kramou
 *date: 10/01/2020
 */
public class FindMissingNumber {

    public static void main(String[] args) {

         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        int num1 = 0;
        for (int i = 0; i < array.length; i++) {
            num1= num1 + array[i];
        }
        System.out.println("1+2+3+4+5+6+7+8+10= "+num1);

        int num2= 0 ;
        for ( int j = 1; j<=10 ; j ++){
            num2 = num2 + j;
        }
        System.out.println("1+2+3+4+5+6+7+8+9+10= "+num2);
        System.out.println("The Missing Number Is: ( 55 - 46 )="+(num2-num1));
    }
}