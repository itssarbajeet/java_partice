
import java.util.ArrayList;

public class A01_FindFirstAndLastIndex {
    class GFG {
    static ArrayList<Long> find(long arr[], int n, int x) {
        ArrayList<Long> nums = new ArrayList<>();
        if (n == 0 ) {
            nums.add(-1L);
            nums.add(-1L);
            return nums;
        }
        nums.add((long) check(arr, n, x, true));
        nums.add((long) check(arr, n, x, false));
        return nums;
    }

    static int check(long arr[], int n, int x, boolean check) {
        int left = 0;
        int right = n - 1;
        int mid;
        while (left <= right) {  // Modified condition to include equality
            mid = left + ((right - left) / 2);
            if (arr[mid] == x && check) {
                if (mid == 0 || arr[mid] > arr[mid - 1]) {
                    return mid;
                } else {
                    right = mid - 1;  // Corrected to reduce the search space
                }
            } else if (arr[mid] == x && !check) {
                if (mid == n - 1 || arr[mid] < arr[mid + 1]) {
                    return mid;
                } else {
                    left = mid + 1;
                }
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else if (arr[mid] > x) {
                right = mid - 1;
            }
        }
        return -1;
    }

public static void main(String[] args) {
    long arr[]={0,1,2,3,4,4,4,4,4,4,4,4,5,6,7,8,9};
    System.out.println("First and Last Index of element "+4+" in array is : "+(find(arr,arr.length,4).toString()));
}

}
}
