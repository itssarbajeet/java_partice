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


