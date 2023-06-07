import java.util.Arrays;

public class A02_Concatenation_of_Array {
    public int[] getConcatenation(int[] nums) {
        int[] c = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            c[i] = nums[i];
            c[i + nums.length] = nums[i];
        }
        return c;
    }

    
    public static void main(String[] args) {
        // Example usage
        int[] nums = {1, 2, 3};
        A02_Concatenation_of_Array solution = new A02_Concatenation_of_Array();
        int[] result = solution.getConcatenation(nums);

        // Print the result
        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println("Concatenated Array: " + Arrays.toString(result));
    }
}
/*
 * Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
 */