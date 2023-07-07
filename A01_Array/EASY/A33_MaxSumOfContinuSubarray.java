import java.util.Arrays;

public class A33_MaxSumOfContinuSubarray {
    // arr: input array
    // n: size of array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n) {
        long max = arr[0];
        int sum=arr[0];
        for (int i = 1; i < n; i++) {

            if (max < arr[i]) {
                max = arr[i];
            } 
        }
        System.out.println(Arrays.toString(arr));
        return max;
    }

    public static void main(String[] args) {
        A33_MaxSumOfContinuSubarray solution = new A33_MaxSumOfContinuSubarray();
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = arr.length;
        long result = solution.maxSubarraySum(arr, n);
        System.out.println("Maximum subarray sum: " + result);
    }
}

