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
