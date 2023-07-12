import java.util.Arrays;

public class A11_CountTripletsWithSumSmallerThanX {
    class Solution {
    static long countTriplets(long arr[], int n, int sum) {
        if (n < 3) {
            return -1;
        }

        Arrays.sort(arr);
        long count = 0;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                long tripletSum = arr[i] + arr[left] + arr[right];

                if (tripletSum < sum) {
                    count += right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int N = 4, sum = 2;
        long arr[] = {-2, 0, 1, 3};
        System.out.println("The number of possible trips is "+ countTriplets(arr,N,sum));
    }
}

}
