import java.util.*;
public class A56_MedianOfTwoSortedArraysOfDifferentSizes {
    public static int findMedian(int[] a, int[] b, int o, int p) {
    int median = 0;
    int arrLength = o + p;
    int[] arr = new int[arrLength];
    
    int i = 0, j = 0, k = 0;
    
    while (i < o && j < p) {
        if (a[i] < b[j]) {
            arr[k++] = a[i++];
        } else {
            arr[k++] = b[j++];
        }
    }
    
    while (i < o) {
        arr[k++] = a[i++];
    }
    
    while (j < p) {
        arr[k++] = b[j++];
    }
    
    // Now, find the median of the merged array
    
    if (arrLength % 2 == 0) {
        median = (arr[arrLength / 2] + arr[(arrLength / 2) - 1]) / 2;
    } else {
        median = arr[arrLength / 2];
    }
    
    return median;
}
public static void main(String args[]){
    int a[] = {-5, 3, 6, 12, 15};
    int b[] = {-12, -10, -6, -3, 4, 10};
    System.out.println("The Median is : " +findMedian(a,b,a.length,b.length));
}

}

