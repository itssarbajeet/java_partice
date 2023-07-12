public class A09_SticklerThief {
    class Solution {
        // Function to find the maximum money the thief can get.
        public static int FindMaxSum(int arr[], int n) {
            if (n == 0) {
                return 0;
            }
            
            if (n == 1) {
                return arr[0];
            }
            
            int[] dp = new int[n];
            dp[0] = arr[0];
            dp[1] = Math.max(arr[0], arr[1]);
            
            for (int i = 2; i < n; i++) {
                dp[i] = Math.max(arr[i] + dp[i-2], dp[i-1]);
            }
            
            return dp[n-1];
        }
        public static void main(String[] args) {
            int arr[]={5,5,10,100,10,5};
            int size=arr.length;
            System.out.println("Maximum stolen amount is "+FindMaxSum(arr,size));
        }
    }
    
}
