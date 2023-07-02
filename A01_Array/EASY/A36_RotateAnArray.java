import java.util.ArrayList;
public class A36_RotateAnArray {
    public static void rotate(int arr[], int n) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = n - 1; i < arr.length; i++) {
            arr1.add(arr[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            arr1.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr1.get(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotations = 2;

        System.out.println("Before rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        rotate(arr, rotations);

        System.out.println("\nAfter rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
 * Given an array, rotate the array by one position in clock-wise direction.
 

Example 1:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
 

Example 2:

Input:
N = 8
A[] = {9, 8, 7, 6, 4, 2, 1, 3}
Output:
3 9 8 7 6 4 2 1
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function rotate() which takes the array A[] and its size N as inputs and modify the array in place.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 

Constraints:
1<=N<=105
0<=a[i]<=105
 */