public class A58_MinimumSwapsAndKTogether {
    public static int minSwaps(int[] arr, int k) {
        int n = arr.length;
        int count_k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                count_k++;
            }
        }

        int count_greater = 0;
        for (int i = 0; i < count_k; i++) {
            if (arr[i] > k) {
                count_greater++;
            }
        }
        int min_swaps = count_greater;
        int left = 0, right = count_k;
        while (right < n) {
            if (arr[left] > k) {
                count_greater--;
            }
            
            if (arr[right] > k) {
                count_greater++;
            }
            
            min_swaps = Math.min(min_swaps, count_greater);
            
            left++;
            right++;
        }
        
        return min_swaps;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 5, 8, 7, 4};
        int k = 6;
        int minSwaps = minSwaps(arr, k);
        System.out.println("Minimum number of swaps required: " + minSwaps);
    }
}
