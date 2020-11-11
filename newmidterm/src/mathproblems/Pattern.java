package mathproblems;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		/** Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * fastest solution to solve the pattern is for loop to avoid time complexity
		 *
		 *Autor: ALAEDDINE Kramou
		 *  date: 10/18/2020
		 */

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter num:");
		int num = obj.nextInt();
		for (int i = num; i >= 32 ; i -- )
		{  System.out.print(i+",");
			obj.close();
		}
	}
}
