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
