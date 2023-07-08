package GFG;

import java.util.Arrays;

public class A09_FindTripletsWithZeroSum {
    class Solution {
    // Function to find triplets with zero sum.
    public static boolean findTriplets(int arr[], int n) {
        Arrays.sort(arr);
        
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            int sum = -arr[i];
            
            while (left < right) {
                if (arr[left] + arr[right] == sum) {
                    return true;
                } else if (arr[left] + arr[right] < sum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        int arr[]={0, -1, 2, -3, 1};
        System.out.println("Is there triplet in arr whose sum =0:  "+findTriplets(arr,arr.length));
    }
}

}
