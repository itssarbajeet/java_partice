import java.util.Arrays;

public class A04_SortedMatrix {
    int[][] sortedMatrix(int n, int Mat[][]) {
        int arr[] = new int[n * n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[count] = Mat[i][j];
                count++;
            }
        }
        count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Mat[i][j] = arr[count];
                count++;
            }
        } 
        return Mat;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        int N = matrix.length;
        A04_SortedMatrix sortedMatrix = new A04_SortedMatrix();
        matrix = sortedMatrix.sortedMatrix(N, matrix);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
