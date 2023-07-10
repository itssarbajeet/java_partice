
public class A10_SmallestPositiveMissingNumber {
    class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int N)
    {
        
        for (int i = 0; i < N; i++) {
            if (arr[i] > 0 && arr[i] <= N) {
                int pos = arr[i] - 1;
                if (arr[pos] != arr[i]) {
                    int temp = arr[pos];
                    arr[pos] = arr[i];
                    arr[i] = temp;
                    i--;
                }
            } 
        }

        // Step 2: Finding the smallest missing number
        for (int i = 0; i < N; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // Step 3: All elements are marked, so the missing number is N + 1
        return N + 1;
    

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        System.out.println("The Smallest Positive Missing Number in given Array : "+missingNumber(arr,n));
    }
}
}
