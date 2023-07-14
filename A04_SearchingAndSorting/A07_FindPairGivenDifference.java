
import java.util.Arrays;

public class A07_FindPairGivenDifference {
    class Solution {
    public static boolean findPair(int arr[], int L, int N) {
        Arrays.sort(arr);
        
        int left = 0;
        int right = 1;
        
        while (left < L && right < L) {
            int diff = arr[right] - arr[left];
            
            if (diff == N) {
                return true;
            } else if (diff < N) {   
                right++;
            } else {
                left++;
                if (left == right) {
                    right++;
                } 
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        int arr[]={5, 20, 3, 2, 5, 80};
        int n=6; //difference between pair of elements in array is equal to this value
        System.out.println("Is there a Pair with given difference: "+findPair(arr,n,115) );
    }
}
}
