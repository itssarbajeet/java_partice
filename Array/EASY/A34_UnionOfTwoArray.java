public class A34_UnionOfTwoArray {
    public static int doUnion(int a[], int n, int b[], int m) {
        int[] occurrence = new int[100001]; // Assuming the maximum value in the arrays is 100000
        
        // Mark the elements from array 'a'
        for (int i = 0; i < n; i++) {
            occurrence[a[i]] = 1;
        }
        
        // Mark the elements from array 'b'
        for (int i = 0; i < m; i++) {
            occurrence[b[i]] = 1;
        }
        
        // Count the marked elements
        int count = 0;
        for (int i = 0; i < occurrence.length; i++) {
            if (occurrence[i] == 1) {
                count++;
            }
        }
        
        return count; // Return the count of unique elements
    }

    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5};
        int[] arrayB = {4, 5, 6, 7, 8};
        int count = doUnion(arrayA, arrayA.length, arrayB, arrayB.length);
        System.out.println("Number of unique elements: " + count);
    }
}


/*
 * Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of elements in the union between these two arrays.

Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.

Note : Elements are not necessarily distinct.

Example 1:

Input:
5 3
1 2 3 4 5
1 2 3
Output: 
5
Explanation: 
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
Example 2:

Input:
6 2 
85 25 1 32 54 6
85 2 
Output: 
7
Explanation: 
85, 25, 1, 32, 54, 6, and
2 are the elements which comes in the
union set of both arrays. So count is 7.
Your Task:
Complete doUnion funciton that takes a, n, b, m as parameters and returns the count of union elements of the two arrays. The printing is done by the driver code.

Constraints:
1 ≤ n, m ≤ 105
0 ≤ a[i], b[i] < 105
 */