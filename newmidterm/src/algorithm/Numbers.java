package algorithm;

import databases.ConnectToSqlDB;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Numbers {

    /**
     * Show all the different kind of sorting algorithm by applying into (num array).
     * Display the execution time for each sorting.Example in below.
     * <p>
     * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
     * <p>
     * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
     * <p>
     * Autor: ALAEDDINE Kramou
     * date: 10/16/2020
     */
    public static void main(String[] args) throws Exception {


        int[] num = new int[10000];
        Sort algo = new Sort();
        storeRandomNumbers(num);
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = ConnectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
       // selection
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        int n = num.length;
        randomize (num, n);
        //insertion
        algo.insertionSort(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
        //bubble
        algo.bubbleSort(num);
        long bubbleSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
        //Merge
        algo.mergeSort(num);
        long mergeSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSortExecutionTime + " milli sec");
        //QuickSort
        algo.quickSort(num,0,10);
        long QuickSortSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + QuickSortSortExecutionTime + " milli sec");
        //HeapSort
        algo.heapSortBuilder(Arrays.stream(num).toArray());
        long heapSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");
        // Bucket Sort
        int max_value = max_value(num);
        algo.bucketSort(num,max_value);
        long BucketSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort take: " + BucketSortExecutionTime  + " milli sec");
        //shellSort
        algo.shellSort(num);
        long shellSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Shell Sort take: " + shellSortExecutionTime + " milli sec");

    }

    public static int max_value(int[] nums) {
        int max_value = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max_value)
                max_value = nums[i];
        return max_value;
    }

    public static void storeRandomNumbers(int [] num){
        Random rand = new Random();
        for(int i=0; i<num.length; i++){
            num[i] = rand.nextInt(10);

        }
    }
    public static void randomize( int arr[], int n)
    {
        Random r = new Random();
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n-1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printValue(List<String> array){
        for(String st:array){
            System.out.println(st);
        }
    }
}
