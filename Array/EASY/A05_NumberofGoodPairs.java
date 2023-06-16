public class A05_NumberofGoodPairs {
    public static void main(String[] args) {
        A05_NumberofGoodPairs solution = new A05_NumberofGoodPairs();
        int[] nums = {1, 2, 3, 1, 1, 3};
        int numGoodPairs = solution.numIdenticalPairs(nums);
        System.out.println("Number of Good Pairs: " + numGoodPairs);
    }
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
               
                }
            } 
        }
        return count;
    }
}
/*
 * Input: nums = [1,2,3,1,1,3]
Output: 4 
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0
 */
