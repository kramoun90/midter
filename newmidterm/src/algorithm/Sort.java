package algorithm;

public class Sort {
    /**
     * sorting algorithm implementation
     * * Store all the sorted data into one of the databases, Selection sort, Insertion Sort,Bubble Sort,
     * Merge Sort ,Quick Sort, Heap Sort, Bucket Sort, Shell Sort.
     *
     * Autor: ALAEDDINE Kramou
     * date: 10/16/2020
     */
    long executionTime = 0;

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;

            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int[] a = array.clone();  //deep copy the array to refresh

        for (int i = 1; i < a.length; i++) {
            int curr = a[i];
            int j = i;
            while (j > 0 && curr < a[j - 1]) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = curr;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    /**
     *
     * @param array
     * @return
     */
    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    /**
     *
     * @param a
     * @return
     */
    public static int[] merge(int[] a) {
        //merge sort method
        if (a.length <= 1)
            return a;
        int[] left = new int[a.length / 2];
        int[] right = new int[a.length - left.length];
        for (int i = 0; i < left.length; i++)
            left[i] = a[i];
        for (int i = 0; i < right.length; i++)
            right[i] = a[i + left.length];

        left = merge(left);
        right = merge(right);

        for (int i = 0, l = 0, r = 0; i < a.length; i++)
            a[i] = (r >= right.length) || (l < left.length && left[l] < right[r]) ? left[l++] : right[r++];
        return a;
    }

    /**
     *
     * @param arr
     * @return
     */

    public long mergeSort(int[] arr) {

        final long startTime = System.currentTimeMillis();
        int[] a = arr.clone();  //deep copy the array to refresh
        merge(a);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return endTime - startTime;

    }

    public void quickSort(int[] arr, int low, int high) {

        final long startTime = System.currentTimeMillis();
        if (arr == null || arr.length == 0)
            return;
        if (low >= high)
            return;
        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        // recursively sort two sub parts
        if (low < j)
            quickSort(arr, low, j);
        if (high > i)
            quickSort(arr, i, high);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
    }

    public int[] heapSortBuilder(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int size = array.length;
        // Build heap
        for (int i = size / 2 - 1; i >= 0; i--)
            heapSort(array, size, i);
        // One by one extract (Max) an element from heap and
        // replace it with the last element in the array
        for (int i = size - 1; i >= 0; i--) {

            //arrA[0] is a root of the heap and is the max element in heap
            int x = array[0];
            array[0] = array[i];
            array[i] = x;

            // call max heapify on the reduced heap
            heapSort(array, i, 0);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    void heapSort(int arrA[], int heapSize, int i) {
        int largest = i; // Initialize largest as root
        int leftChildIdx = 2 * i + 1; // left = 2*i + 1
        int rightChildIdx = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (leftChildIdx < heapSize && arrA[leftChildIdx] > arrA[largest])
            largest = leftChildIdx;

        // If right child is larger than largest so far
        if (rightChildIdx < heapSize && arrA[rightChildIdx] > arrA[largest])
            largest = rightChildIdx;

        // If largest is not root
        if (largest != i) {
            int swap = arrA[i];
            arrA[i] = arrA[largest];
            arrA[largest] = swap;

            // Recursive call to  heapify the sub-tree
            heapSort(arrA, heapSize, largest);
        }
    }

    public int[] bucketSort(int[] array, int max_value) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int[] Bucket = new int[max_value + 1];
        int[] sorted_nums = new int[array.length];
        for (int i = 0; i < array.length; i++)
            Bucket[array[i]]++;
        int outPos = 0;
        for (int i = 0; i < Bucket.length; i++)
            for (int j = 0; j < Bucket[i]; j++)
                sorted_nums[outPos++] = i;
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] shellSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int increment = array.length / 2;
        while (increment > 0) {
            for (int i = increment; i < array.length; i++) {
                int j = i;
                int temp = array[i];
                while (j >= increment && array[j - increment] > temp) {
                    array[j] = array[j - increment];
                    j = j - increment;
                }
                array[j] = temp;
            }
            if (increment == 2) {
                increment = 1;
            } else {
                increment *= (5.0 / 11);
            }
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
        }
    }
}
