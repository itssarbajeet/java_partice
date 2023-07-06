public class A05_RotateAMatrixBy90Degree {
    static int[][] rotateArrayBy90Degrees(int[][] mat) {
        int[][] arr = new int[mat.length][mat.length];
        int count = 2;
        int consta = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                arr[i][j] = mat[count][consta];
                count--;
            }
            count = 2;
            consta++;
        }
        return arr;
    }
 
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        mat = rotateArrayBy90Degrees(mat);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
