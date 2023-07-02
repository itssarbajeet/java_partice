public class A03_RowWithMax1s {
   static int rowWithMax1s(int arr[][], int n, int m) {
        if (arr == null || n <= 0 || m <= 0) {
            return -1; 
        }

        int max = 0;
        int index = -1; 
        int entered = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    count++;
                    entered++;
                }
            }
            if (count > max) {
                max = count;
                index = i;
            }
        }
        if (entered == 0) {
            return -1;
        }
        return index;
    }
    public static void main(String[] args) {
       int N = 4 , M = 4;
       int arr[][] = {{0, 1, 1, 1},
                      {0, 0, 1, 1},
                      {1, 1, 1, 1},
                      {0, 0, 0, 0}};
      System.out.print(rowWithMax1s(arr,N,M));
    }
}
