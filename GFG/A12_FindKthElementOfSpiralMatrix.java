
public class A12_FindKthElementOfSpiralMatrix {
       static class Solution {
        static int findK(int a[][], int n, int m, int k) {
            int left = 0;
            int right = m-1;
            int top = 0;
            int bottom = n-1;
            int count = 1;
    
            for (int i = 0; i < n; i++) {
                for (int j = left; j <= right; j++) {
                    if (count == k) {
                        return a[i][j];
                    }
                    count++;
                }
                top++;
    
                for (int j = top; j <= bottom; j++) {
                    if (count == k) {
                        return a[j][right]; 
                    }
                    count++; 
                }
                right--;
    
                for (int j = right ; j >= left; j--) {
                    if (count == k) {
                        return a[bottom][j];
                    }
                    count++;
                }
                bottom--;
    
                for (int j = bottom ; j >= top; j--) {
                    if (count == k) {
                        return a[j][left];
                    }
                    count++;
                }
                left++;
            }
            return -1;
        }
    
    
        public static void main(String[] args) {
            int arr[][]={{1 ,2 , 3,  4},
                      {5  ,6  ,7  ,8},
                      {9  ,10 ,11, 12},
                      {13 ,14 ,15 ,16}};
            System.out.print(findK(arr,4,4,10));
        }
    }
    
}
