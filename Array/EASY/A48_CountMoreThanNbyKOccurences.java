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
 * Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
 

Example 1:

Input:
N = 7
a[] = {2,6,1,9,4,5,3}
Output:
6
Explanation:
The consecutive numbers here
are 1, 2, 3, 4, 5, 6. These 6 
numbers form the longest consecutive
subsquence.
Example 2:

Input:
N = 7
a[] = {1,9,3,10,4,20,2}
Output:
4
Explanation:
1, 2, 3, 4 is the longest
consecutive subsequence.
 */