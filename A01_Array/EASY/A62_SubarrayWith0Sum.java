import java.util.HashSet;

public class A62_SubarrayWith0Sum {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            
            if (sum == 0 || set.contains(sum))
                return true;
                        set.add(sum);
        }
        
        return false;
    }
    public static void main(String[] args) {
        int arr[]={4 ,2 ,-3 ,1 ,6};
        if(findsum(arr, arr.length)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
