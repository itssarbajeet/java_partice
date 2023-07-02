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
        A42_MergeIntervals solution = new A42_MergeIntervals();

        // Test case
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] mergedIntervals = solution.merge(intervals);

        // Output the merged intervals
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
/*
 * optimised code
 */

/*
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 

Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104
 */