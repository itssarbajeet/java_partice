package GFG;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A07_QuickSort {
    // Function to sort an array using the QuickSort algorithm.
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[]={ 2, 1, 6, 10, 4, 1, 3, 9, 7};
        System.out.println("Original Array: "+ Arrays.toString(arr)) ;
        quickSort(arr, 0, arr.length-1);
        System.out.println("After Sorted: "+Arrays.toString(arr));

        
    }
}


