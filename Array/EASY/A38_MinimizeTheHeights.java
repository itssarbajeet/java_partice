import java.util.Arrays;

class A38_MinimizeTheHeights {
    int getMinDiff(int[] arr, int n, int k) {
        if (n == 1) {
            return 0;
        }
        
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n - 1];
        int diff = max - min;
        
        for (int i = 1; i < n; i++) {
            if (arr[i] < k) {
                continue;
            }
            
            max = Math.max(arr[n - 1] - k, arr[i - 1] + k);
            min = Math.min(arr[0] + k, arr[i] - k);
            diff = Math.min(diff, max - min);
        }
        
        return diff;
    }
    
    public static void main(String[] args) {
        A38_MinimizeTheHeights solution = new A38_MinimizeTheHeights();
        int[] arr = {1, 5, 8, 10};
        int n = arr.length;
        int k = 2;
        int minDiff = solution.getMinDiff(arr, n, k);
        System.out.println("Minimum Difference: " + minDiff);
    }
}
