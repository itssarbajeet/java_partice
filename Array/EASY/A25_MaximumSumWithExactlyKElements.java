class A25_MaximumSumWithExactlyKElements{

    public static void main(String[] args) {
        A25_MaximumSumWithExactlyKElements solution = new A25_MaximumSumWithExactlyKElements();

        // Example usage
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        int result = solution.maximizeSum(nums, k);
        System.out.println("Maximized sum: " + result);
    }

    public int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        int sum = 0;

        // Find the maximum number in the array
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        int count = 0;
        // Add the maximum number to the sum for 'k' times
        for (int i = 0; i < k; i++) {
            sum += max + count;
            count++;
        }

        return sum;
    }
}

