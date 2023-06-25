    public class A37_MaxSumOfASubArrayKadanesAlgo {
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n) {
        long max = arr[0];
        long currSum = arr[0];

        for (int i = 1; i < n; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            max = Math.max(max, currSum);
        }

        return max;
    }

    public static void main(String[] args) {
        A37_MaxSumOfASubArrayKadanesAlgo solution = new A37_MaxSumOfASubArrayKadanesAlgo();

        // Example usage
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = arr.length;
        long maxSum = solution.maxSubarraySum(arr, n);
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}


