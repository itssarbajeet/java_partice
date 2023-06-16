public class A09_RunningSumof1dArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] runningSum = runningSum(arr);
        
        // Printing the running sum
        for (int num : runningSum) {
            System.out.print(num + " ");
        }
    }  
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
 