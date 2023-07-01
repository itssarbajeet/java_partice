import java.util.Arrays;

public class A55_ArraySubsetOfAnotherArray {
    public static String isSubset(long a1[], long a2[], long n, long m) {
        Arrays.sort(a1);
        Arrays.sort(a2);
        
        if (m > n) {
            return "No";
        }
        
        int left = 0;
        int right = 0;
        
        while (left < n && right < m) {
            if (a1[left] < a2[right]) {
                left++;
            } else if (a1[left] == a2[right]) {
                left++;
                right++;
            } else {
                return "No";
            }
        }
        
        if (right == m) {
            return "Yes";
        } else {
            return "No";
        }
    }
    public static void main(String args[]){
        long a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
        long a2[] = {11, 3, 7, 1, 7};
        System.out.println("Is subset of another array: "+ isSubset(a1,a2,a1.length,a2.length));
    }
}


