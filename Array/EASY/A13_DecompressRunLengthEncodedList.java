class A13_DecompressRunLengthEncodedList{
    public int[] decompressRLElist(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum = sum + nums[i];
        }
        int[] arr = new int[sum];
        sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            while (freq > 0) {
                arr[sum] = val;
                sum++;
                freq--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        A13_DecompressRunLengthEncodedList solution = new A13_DecompressRunLengthEncodedList();

        int[] nums = {1,2,3,4};
        int[] decompressed = solution.decompressRLElist(nums);

        // Print the decompressed array
        for (int num : decompressed) {
            System.out.print(num + " ");
        }
    }
} 

/*
 * optimised code 
 * class Solution {
    public int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }
        
        int[] result = new int[arrSize];

        int startIdx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }
        return result;
    }
}
 */
/**
 * Input: nums = [1,2,3,4]
Output: [2,4,4,4]
Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
 */
