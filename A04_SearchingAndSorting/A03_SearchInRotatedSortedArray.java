
public class A03_SearchInRotatedSortedArray {
    class Solution {
        public static int search(int[] nums, int target) {
            int pivot = getPivot(nums);
            int index = binarySearch(nums, target, 0, pivot);
            if (index == -1) {
                index = binarySearch(nums, target, pivot, nums.length - 1);
            }
            return index; 
        }
    
        static int getPivot(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] > nums[right]) {
                    left = mid + 1;
                } else { 
                    right = mid;
                }
            }
            return left;
        }
    
       static int binarySearch(int[] nums, int target, int start, int end) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int nums[]={50,60,70,82,0,5,9,20};
            System.out.println(search(nums,2));
        }
    }
}
