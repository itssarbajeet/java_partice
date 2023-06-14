class A17_DifferenceBetweenElementSumandDigitSumofanArray{
    public static void main(String[] args) {
        int[] nums = {1,15,6,3};
        A17_DifferenceBetweenElementSumandDigitSumofanArray solution = new A17_DifferenceBetweenElementSumandDigitSumofanArray();
        int difference = solution.differenceOfSum(nums);
        System.out.println("Difference of Sum: " + difference);
    }
  
    public int differenceOfSum(int[] nums) {
        int digitSum = 0, elementSum = 0;
        for (int i = 0; i < nums.length; i++) {
            digitSum += nums[i];
            int temp = nums[i];
            while (temp != 0) {
                elementSum += temp % 10;
                temp /= 10;
            }
        }
        digitSum = Math.abs(elementSum - digitSum);
        return digitSum;
    } 
} 
/*
 * Input: nums = [1,15,6,3]
Output: 9
Explanation:  
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.
 */
