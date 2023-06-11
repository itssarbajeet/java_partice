class A19_NumberofArithmeticTriplets{
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = nums.length - 1; i > 1; i--) {
            for (int j = i - 1; j > 0; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    if (nums[i] - nums[j] == diff && nums[j] - nums[k] == diff) {
                        count++;
                    }
                }
            } 
        }
        return count;
    }


public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;
        A19_NumberofArithmeticTriplets solution = new A19_NumberofArithmeticTriplets();
        int result = solution.arithmeticTriplets(nums, diff);
        System.out.println("Count of arithmetic triplets: " + result);
    }
}
}
/*
 * Input: nums = [0,1,4,6,7,10], diff = 3
Output: 2
Explanation:
(1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
(2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3.
 */