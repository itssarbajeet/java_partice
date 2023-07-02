public class A22_LargestLocalValuesinaMatrix {
    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        A22_LargestLocalValuesinaMatrix solution = new A22_LargestLocalValuesinaMatrix();
        int[][] largestLocalGrid = solution.largestLocal(grid);

        for (int i = 0; i < largestLocalGrid.length; i++) {
            for (int j = 0; j < largestLocalGrid[i].length; j++) {
                System.out.print(largestLocalGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] arr = new int[n - 2][n - 2];

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        arr[i][j] = Math.max(arr[i][j], grid[k][l]);
                    }
                }
            }
        } 

        return arr;
    } 
}
/*
optimised code to be remembered *
class Solution {
   public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n - 2][n - 2];
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                ans[i][j] = getMax(grid, i+1, j+1);
            }
        }
        return ans;
    }

    private int getMax(int[][] grid, int i, int j) {
        int max = grid[i][j];
        max = Math.max(max, grid[i][j - 1]);
        max = Math.max(max, grid[i - 1][j - 1]);
        max = Math.max(max, grid[i - 1][j]);
        max = Math.max(max, grid[i - 1][j + 1]);
        max = Math.max(max, grid[i][j + 1]);
        max = Math.max(max, grid[i + 1][j + 1]);
        max = Math.max(max, grid[i + 1][j]);
        max = Math.max(max, grid[i + 1][j - 1]);
        return max;
    }
}
 * Input: grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
Output: [[2,2,2],[2,2,2],[2,2,2]]
Explanation: Notice that the 2 is contained within every contiguous 3 x 3 matrix in grid.
 */