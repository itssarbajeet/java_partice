package GFG;

import java.util.Arrays;

public class A08_MergeWithoutExtraSpace {
    // Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) {
        int i = n - 1;
        int j = 0;
        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                long temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    // Main method to test the code.
    public static void main(String[] args) {
        // Example usage
        long[] arr1 = {1, 3, 5, 7};
        long[] arr2 = {2, 4, 6, 8};
        int n = arr1.length;
        int m = arr2.length;

        merge(arr1, arr2, n, m);

        System.out.println("Merged Array 1: " + Arrays.toString(arr1));
        System.out.println("Merged Array 2: " + Arrays.toString(arr2));
    }
}
