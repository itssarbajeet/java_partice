import java.util.Arrays;

public class A07_KthEmentInMatrix {
    public static int kthSmallest(int[][]mat,int n,int k)
	{
	    int count=0;
        int arr[]=new int[n*n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[count]=mat[i][j];
                count++;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static void main(String[] args) {
        int N = 4;
        int[][] mat = {
            {16, 28, 60, 64},
            {22, 41, 63, 91},
            {27, 50, 87, 93},
            {36, 78, 87, 94}
        };
        System.out.println(kthSmallest(mat, N, 3));
    }
}
