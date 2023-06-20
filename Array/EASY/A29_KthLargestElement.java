import java.util.Arrays;

public class A29_KthLargestElement {
        public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        A29_KthLargestElement solution = new A29_KthLargestElement();
        int[] nums = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        int k = 3;
        int kthLargest = solution.findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element in the array is: " + kthLargest);
    }
}
/*
 * Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

You must solve it in O(n) time complexity.

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 

Constraints:

1 <= k <= nums.length <= 105
-104 <= nums[i] <= 104
 */