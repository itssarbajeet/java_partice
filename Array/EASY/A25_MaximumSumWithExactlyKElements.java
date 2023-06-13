class A25_MaximumSumWithExactlyKElements{

    public static void main(String[] args) {
        A25_MaximumSumWithExactlyKElements solution = new A25_MaximumSumWithExactlyKElements();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        int result = solution.maximizeSum(nums, k);
        System.out.println("Maximized sum: " + result);
    }
    public int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        int count = 0;
        for (int i = 0; i < k; i++) {
            sum += max + count;
            count++;
        }

        return sum;
    }
}
/*
 * Input: nums = [1,2,3,4,5], k = 3
Output: 18
Explanation: We need to choose exactly 3 elements from nums to maximize the sum.
For the first iteration, we choose 5. Then sum is 5 and nums = [1,2,3,4,6]
For the second iteration, we choose 6. Then sum is 5 + 6 and nums = [1,2,3,4,7]
For the third iteration, we choose 7. Then sum is 5 + 6 + 7 = 18 and nums = [1,2,3,4,8]
So, we will return 18.
It can be proven, that 18 is the maximum answer that we can achieve.
 */

