import java.util.Arrays;

public class A30_sort_0_1_2_withOutSortAlgo {
    public void sortColors(int[] nums) {
        int z = 0, t = 0, o = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                z++;
            } else if (nums[i] == 1) {
                o++;
            } else if (nums[i] == 2) {
                t++;
            }
        }

        int i = 0;
        while (i < nums.length) {
            if (i < z) {
                nums[i] = 0;
            } else if (i < z + o) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        A30_sort_0_1_2_withOutSortAlgo solution = new A30_sort_0_1_2_withOutSortAlgo();
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


