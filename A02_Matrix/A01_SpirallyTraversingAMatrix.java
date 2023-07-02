import java.util.*;
class A01_SpirallyTraversingAMatrix
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        int left=0;
        int right=c-1;
        int top=0;
        int bottom=r-1;
        ArrayList<Integer> arr=new ArrayList<>();
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                arr.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                arr.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                arr.add(matrix[i][left]);
            }
            left++;
            }
            
        }
        return arr;
        }
        public static void main(String[] args) {
            int r = 4, c = 4;
            int matrix[][] = {{1, 2, 3, 4},
                             {5, 6, 7, 8},
                             {9, 10, 11, 12},
                             {13, 14, 15,16}};
            ArrayList <Integer> arr=spirallyTraverse(matrix, r, c);
            for(int i: arr){
                System.out.print(i+" ");
            }
        }
    }