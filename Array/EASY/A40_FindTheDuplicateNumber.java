public class A40_FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int[] freq = new int[nums.length + 1];
        int duplicate = 0;
        
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
            
            if (freq[nums[i]] > 1) {
                duplicate = i;
                break;
            }
        }
        
        return nums[duplicate];
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4, 5}; // Example input
        
        A40_FindTheDuplicateNumber solution = new A40_FindTheDuplicateNumber();
        int duplicate = solution.findDuplicate(nums);
        
        System.out.println("The duplicate element is: " + duplicate);
    }
}
