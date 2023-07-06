    class A02_SearchA2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false; 
    }
    public static void main(String[] args) {
           int matrix[][] = {{1, 2, 3, 4},
                             {5, 6, 7, 8},
                             {9, 10, 11, 12},
                             {13, 14, 15,16}};
            if(searchMatrix(matrix,10)){
                System.out.println("Element found");
            }
            else{
                 System.out.println("Element not found");
               
            }

    }
}


