
public class A11_TransposeOfMatrix {
    public static void transpose(int n, int a[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = {{1, 1, 1, 1},
                       {2, 2, 2, 2},
                       {3, 3, 3, 3},
                       {4, 4, 4, 4}};
        transpose(mat.length, mat);
        for (int[] num : mat) {
            for (int val : num) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
