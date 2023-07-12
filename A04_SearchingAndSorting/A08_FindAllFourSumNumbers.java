
import java.util.ArrayList;
import java.util.Arrays;

public class A08_FindAllFourSumNumbers {
    class Solution {
    public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> nums = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue; // Skip duplicates for the first number
            }
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue; // Skip duplicates for the second number
                }
                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == k) {
                        ArrayList<Integer> quad = new ArrayList<>();
                        quad.add(arr[i]);
                        quad.add(arr[j]);
                        quad.add(arr[left]);
                        quad.add(arr[right]);
                        nums.add(quad);
                        left++;
                        right--;
                        while (left < right && arr[left] == arr[left - 1]) {
                            left++; // Skip duplicates for the third number
                        }
                        while (left < right && arr[right] == arr[right + 1]) {
                            right--; // Skip duplicates for the fourth number
                        }
                    } else if (sum < k) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int A[] = {10,2,3,4,5,7,8}; 
        int k=23;
        ArrayList<ArrayList<Integer>> nums=fourSum( A, k);
        System.out.print(nums);

    }
}

}
