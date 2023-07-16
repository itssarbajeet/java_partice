import java.util.*;
class A04_CountTheSubArraysHavingProductLessThanK {
    public static  int countSubArrayProductLessThanK(long a[], int n, long k) {
        int count = 0;
        long product = 1;

        for (int start = 0, end = 0; end < n; end++) {
            product *= a[end];

            while (start <= end && product >= k) {
                product /= a[start];
                start++;
            } 

            count += end - start + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        long[] arr = {2, 4, 6}; 
        int n = arr.length;
        long k = 50;

        int subArrayCount = countSubArrayProductLessThanK(arr, n, k);
        System.out.println("Number of subarrays with product less than " + k + ": " + subArrayCount);
    }
}
