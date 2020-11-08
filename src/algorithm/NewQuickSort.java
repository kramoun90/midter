package algorithm;

public class NewQuickSort {
    long executionTime = 0;

    public static void main(String[] args) {
        int[] num = new int[10];
        Sort algo = new Sort();
//        algo.quickSort(num[i],num.length);
        long QuickSortSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + QuickSortSortExecutionTime + " milli sec");
    }




    private int[] numbers;
    private int number;

    private long quickSort(int[] values) {
        this.numbers = values.clone();
        number = values.length;
        long startTime = System.currentTimeMillis();
        sort(0, number - 1);
        long endTime = System.currentTimeMillis();   //timer off
        return endTime - startTime; //final count by subtracting them
    }

    private void sort(int low, int high) {
        final long startTime = System.currentTimeMillis();
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high-low)/2];

        // Divide into two lists
        while (i <= j) {
            while (numbers[i] < pivot) {
                i++;
            }
            while (numbers[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            sort(low, j);
        if (i < high)
            sort(i, high);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

}
