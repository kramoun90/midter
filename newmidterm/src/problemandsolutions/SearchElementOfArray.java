package problemandsolutions;

/**
 * write a Java program to search for an element of an integer array of 10 elements.
 * By using the sequential search algorithm,
 *
 * Autor: ALAEDDINE Kramou
 * date: 10/18/2020
 */
public class SearchElementOfArray {

    public static int linearSearch(int[] inputArray,int target)
    {
        for(int i=0;i<inputArray.length;i++)
        {
            if(inputArray[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int[] arr1 = {5,9,10,2,90,4,8,7,11,23};

        int target = 4;
        int result = linearSearch(arr1,target);
        System.out.println( (result != -1) ? "Required target: "+target+" found at index: "+result : "target "+target+ " not found");
        //try with another target
        target = 3;
        result = linearSearch(arr1,target);
        System.out.println( (result != -1) ? "Required target: "+target+" found at index:- "+result : "target "+target+ " not found");

    }
}
