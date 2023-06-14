public class A23_MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - i - 1];
        }

        if (mat.length % 2 != 0) {
            int middle = n / 2;
            sum -= mat[middle][middle];
        }

        return sum;
    } 

    public static void main(String[] args) {
        // Example usage
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        A23_MatrixDiagonalSum diagonalSumCalculator = new A23_MatrixDiagonalSum();
        int sum = diagonalSumCalculator.diagonalSum(matrix);

        System.out.println("Sum of matrix diagonals: " + sum);
    }
}
/*
 * Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
Example 2:

Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8
 */ 