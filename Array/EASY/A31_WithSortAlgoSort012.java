import java.util.Arrays;

public class A31_WithSortAlgoSort012 {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }

    public static void main(String[] args) {
        A31_WithSortAlgoSort012 solution = new A31_WithSortAlgoSort012();
        int[] nums = {2, 0, 2, 1, 1, 0};
        System.out.println("Before sorting: " + Arrays.toString(nums));
        solution.sortColors(nums);
        System.out.println("After sorting: " + Arrays.toString(nums));
    }
    
}
/*
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 */