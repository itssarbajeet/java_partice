import java.util.Arrays;

public class A43_NextPermutation {
    int[] reverse(int[] nums, int begin, int end) {
        while (begin < end) {
            nums[begin] = nums[begin] ^ nums[end];
            nums[end] = nums[begin] ^ nums[end];
            nums[begin] = nums[begin] ^ nums[end];
            begin++;
            end--;
        }
        return nums;
    }

    public void nextPermutation(int[] nums) {
        int k = nums.length - 2;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (k >= 0 && nums[k] >= nums[k + 1]) {
                k--;
            }
        }

        if (k == -1) {
            nums = reverse(nums, 0, nums.length - 1);
            return;
        }

        // Swap
        for (int i = nums.length - 1; i > k; i--) {
            if (nums[i] > nums[k]) {
                nums[i] = nums[i] ^ nums[k];
                nums[k] = nums[i] ^ nums[k];
                nums[i] = nums[i] ^ nums[k];
                break;
            }
        }
        reverse(nums, k + 1, nums.length - 1);
        return;
    }

    public static void main(String[] args) {
        A43_NextPermutation solution = new A43_NextPermutation();
        int[] nums = {1, 2,4, 3};
        System.out.println("Before permutation: " + Arrays.toString(nums));
        solution.nextPermutation(nums);
        System.out.println("After permutation: " + Arrays.toString(nums));
    }
}

    
