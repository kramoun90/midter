package stringproblems;


import java.util.Scanner;
/**
 * Write a java program to find the duplicate words and their number of occurrences in the string.
 * Also Find the average length of the words.
 *
 */
public class DuplicateWord {

    public static void main(String[] args) {

        String string = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        int count;
        string = string.toLowerCase();
        String words[] = string.split(" ");

        System.out.println("Duplicate words in a given string : ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            //Displays the duplicate word if count is greater than 1
            if (count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the Duplicated words, then press enter: ");

        int count1 = 0;
        double sum = 0;

        while (sc.hasNext()) {
            String userInput = sc.next();
            double charNum = userInput.length();
            sum = charNum + sum;
            count1++;
            double average = 0;
            if (count1 > 0) {
                average = sum / count1;
            }
            System.out.println(" The Average length of the words= " + average);
            sc.close();
            break;
        }


    }

}
