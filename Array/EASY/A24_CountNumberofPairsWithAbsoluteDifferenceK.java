public class A24_CountNumberofPairsWithAbsoluteDifferenceK {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Example usage
        A24_CountNumberofPairsWithAbsoluteDifferenceK solution = new A24_CountNumberofPairsWithAbsoluteDifferenceK();
        int[] nums = {1, 5, 3, 4, 2};
        int k = 2;
        int result = solution.countKDifference(nums, k);
        System.out.println("Number of pairs with absolute difference " + k + ": " + result);
    }
}
/*
 * Input: nums = [1,2,2,1], k = 1
Output: 4
Explanation: The pairs with an absolute difference of 1 are:
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1]
Example 2:

Input: nums = [1,3], k = 3
Output: 0
Explanation: There are no pairs with an absolute difference of 3.
 */
