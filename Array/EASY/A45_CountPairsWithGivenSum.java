import java.util.*;

public class A45_CountPairsWithGivenSum {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the length of the array: ");
            int n = scanner.nextInt();
            System.out.print(" Enter the target element :");
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int ans = new A45_CountPairsWithGivenSum().getPairsCount(arr, n, k);
            System.out.println(ans);
        
        scanner.close();
    }

    int getPairsCount(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int count = 0;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == k) {
                if (arr[left] == arr[right]) {
                    int frequency = right - left + 1;
                    count += (frequency * (frequency - 1)) / 2;
                    break;
                } else {
                    int leftFrequency = 1;
                    while (left + 1 < right && arr[left] == arr[left + 1]) {
                        left++;
                        leftFrequency++;
                    }

                    int rightFrequency = 1;
                    while (right - 1 > left && arr[right] == arr[right - 1]) {
                        right--;
                        rightFrequency++;
                    }

                    count += (leftFrequency * rightFrequency);
                    left++;
                    right--;
                }
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }

}

/*
 * Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.


Example 1:

Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation: 
arr[0] + arr[1] = 1 + 5 = 6 
and arr[1] + arr[3] = 5 + 1 = 6.

Example 2:

Input:
N = 4, K = 2
arr[] = {1, 1, 1, 1}
Output: 6
Explanation: 
Each 1 will produce sum 2 with any 1.

Your Task:
You don't need to read input or print anything. Your task is to complete the function getPairsCount() which takes arr[], n and k as input parameters and returns the number of pairs that have sum K.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= N <= 105
1 <= K <= 108
1 <= Arr[i] <= 106
 */