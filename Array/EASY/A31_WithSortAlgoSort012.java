import java.util.Arrays;

public class A31_WithSortAlgoSort012 {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }

    public static void main(String[] args) {
        A31_WithSortAlgoSort012 solution = new A31_WithSortAlgoSort012();
        int[] nums = {2, 0, 2, 1, 1, 0};
        System.out.println("Before sorting: " + Arrays.toString(nums));
        solution.sortColors(nums);
        System.out.println("After sorting: " + Arrays.toString(nums));
    }
    
}
/*
 * Optiimised code (Dutch National FLag Algorithm)
class Solution {

    public void swap(int arr[],int x,int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public void sortColors(int[] arr)
    {

        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[mid] == 0)
            {
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1)
            {
                mid++;
            }
            else if(arr[mid] == 2)
            {
              swap(arr,mid,high);
              high--;
            }
        }
        
    }
}
 */
/*
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 */