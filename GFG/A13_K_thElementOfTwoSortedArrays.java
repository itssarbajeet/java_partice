public class A13_K_thElementOfTwoSortedArrays {
    class Solution {
        public static long kthElement(int arr1[], int arr2[], int n, int m, int k) {
            // Check if k is out of range
            if (k < 1 || k > n + m) {
                return -1;
            }
    
            int point1 = 0;
            int point2 = 0;
            int count = 0;
            while (point1 < n && point2 < m) {
                if (arr1[point1] < arr2[point2]) {
                    count++;
                    if (count == k) {
                        return arr1[point1];
                    }
                    point1++;
                } else if (arr1[point1] > arr2[point2]) {
                    count++;
                    if (count == k) {
                        return arr2[point2];
                    }
                    point2++;
                } else {
                    count++;
                    if (count == k) {
                        return arr1[point1];
                    }
                    count++;
                    if (count == k) {
                        return arr2[point2];
                    }
                    
                    point1++;
                    point2++;
                }
            }
    
            // If kth element is not found yet, check in the remaining array
            while (point1 < n) {
                count++;
                if (count == k) {
                    return arr1[point1];
                }
                point1++;
            }
            while (point2 < m) {
                count++;
                if (count == k) {
                    return arr2[point2];
                }
                point2++;
            }
    
            // kth element is not found
            return -1;
        }
        
        public static void main(String[] args) {
            int arr1[] = {2, 3, 6, 7, 9};
            int k = 5;
            int arr2[] = {1, 4, 8, 10};
            System.out.println("K'th smallest number: " + kthElement(arr1,arr2,arr1.length,arr2.length,k));
        }
    }
}

