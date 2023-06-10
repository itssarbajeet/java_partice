import java.util.Arrays;

public class A01_Build_Array_from_Permutation {
    public int[] buildArray(int[] nums) {
        int[] d = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            d[i] = nums[nums[i]];
        }
        return d;
    }
    public static void main(String[] args) {
        // Example usage
        int[] nums = {0, 2, 1, 5, 3, 4};
        A01_Build_Array_from_Permutation solution = new A01_Build_Array_from_Permutation();
        int[] result = solution.buildArray(nums);
        
        // Print the result
        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println("Modified Array: " + Arrays.toString(result));
    }
}

/*
 * Example 1:

Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows: 
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
Example 2:

Input: nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    = [4,5,0,1,2,3]
 * 
 * 
 * 
 */