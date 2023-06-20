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
