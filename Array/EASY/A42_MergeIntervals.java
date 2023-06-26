import java.util.Arrays;
import java.util.Comparator;

class A42_MergeIntervals {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        int index = 0;
        int[][] arrO = new int[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i][1] >= arr[i + 1][0]) {
                arr[i + 1][0] = arr[i][0];
                arr[i + 1][1] = Math.max(arr[i][1], arr[i + 1][1]);
            } else {
                arrO[index][0] = arr[i][0];
                arrO[index][1] = arr[i][1];
                index++;
            }
        }

        return Arrays.copyOf(arrO, index);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] mergedIntervals = solution.merge(intervals);

        // Output the merged intervals
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}


