//my logic
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int rightSum = 0;
            int leftSum = 0;
            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }
            for (int k = i; k < i; k++) {
                leftSum += nums[k];
            }
            arr[i] = Math.abs(rightSum - leftSum);
        }
        return arr;
    }

    public static void main(String[] args) {
        // Example usage
        Solution solution = new Solution();
        int[] nums = {10,4,8,3};
        int[] result = solution.leftRightDifference(nums);
        System.out.println("Left-Right Differences: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
/* OPTIMIZED CODE 
 * class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0;
        int rightSum = totalSum;
        
        for (int i = 0; i < n; i++) {
            rightSum -= nums[i];
            arr[i] = Math.abs(rightSum - leftSum);
            leftSum += nums[i];
        }
        
        return arr;
    }
}
 */
