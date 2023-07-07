public class A48_CountMoreThanNbyKOccurences {
    public static int countOccurence(int[] arr, int n, int k) 
    {
        int count=0;
        int arr1[]=new int[1000001];
        for(int i=0;i<n;i++){
            arr1[arr[i]]++;
        }
        for(int i: arr1){
            if(i>(n/k)){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,3,2,3,3,1,2,2,3,2,3};
        int k=3;
        System.out.println(countOccurence(arr,arr.length,k));
    }
}
/*
 * Given an array of size n and an integer k, find all elements in the array that appear more than n/k times. 

Examples:

Input: arr[] = {3, 1, 2, 2, 1, 2, 3, 3}, k = 4
Output: {2, 3}
Explanation: Here n/k is 8/4 = 2, therefore 2 appears 3 times in the array that is greater than 2 and 3 appears 3 times in the array that is greater than 2

Input: arr[] = {9, 8, 7, 9, 2, 9, 7}, k = 3
Output: {9}
Explanation: Here n/k is 7/3 = 2, therefore 9 appears 3 times in the array that is greater than 2.


 */
 