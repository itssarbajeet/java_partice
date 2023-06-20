import java.util.Arrays;

public class A32_MoveAllNegativeToLeft {
    private static int[] swap(int[]arr,int first,int second){
        arr[first]=arr[first]^arr[second];
        arr[second]=arr[first]^arr[second];
        arr[first]=arr[first]^arr[second];
        return arr;
    }
    public static void moveNegative(int[] nums){
        int high=nums.length-1;
        int check=0;
        for (int i :nums){
            if(nums[check]<0){
                check++;
            }
            else if(nums[high]<0){
                swap(nums,check,high);
                check++;
                high--;
            }
        }

    }
    public static void main(String args[]){
        int arr[] = {-1, -5,-6,8,-3,9,7,10,-8};
        moveNegative(arr);
        System.out.println(Arrays.toString(arr));
    }
}
/*
 * An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.

Examples : 

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5

Note: Order of elements is not important here.
 */