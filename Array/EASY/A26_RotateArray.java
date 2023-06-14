public class A26_RotateArray {
    public static void main(String[] args) {
        A26_RotateArray solution = new A26_RotateArray();

        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        A26_RotateArray.rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        int size = nums.length;
        int[] arr = new int[size];

        for (int i = 0; i < k; i++) {
            arr[i] = nums[size - k + i];
        }

        for (int i = k; i < size; i++) {
            arr[i] = nums[i - k];
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
