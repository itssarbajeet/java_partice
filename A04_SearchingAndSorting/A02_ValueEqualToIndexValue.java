import java.util.*;

public class A02_ValueEqualToIndexValue {
    class Solution {
       static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
            ArrayList<Integer> nums=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(arr[i]==(i+1)){
                    nums.add(i+1);
                } 
            }
            return nums;
        }
        public static void main(String[] args) {
            int arr[]={2,2,3,5,6,7};
            System.out.println("The correct value at index is: "+(valueEqualToIndex(arr,arr.length)).toString());
        } 
    }
}
