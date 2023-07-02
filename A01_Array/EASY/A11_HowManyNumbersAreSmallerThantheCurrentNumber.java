public class A11_HowManyNumbersAreSmallerThantheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
             
            arr[i] = count;
        } 
        return arr;
    } 
     
    public static void main(String[] args) {
        A11_HowManyNumbersAreSmallerThantheCurrentNumber solution = new A11_HowManyNumbersAreSmallerThantheCurrentNumber();
        
        // Example usage  
        int[] nums = {7,7,7,7};
        int[] result = solution.smallerNumbersThanCurrent(nums);
        
        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
}
}