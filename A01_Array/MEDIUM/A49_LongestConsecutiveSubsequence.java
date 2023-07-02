import java.util.*;
public class A49_LongestConsecutiveSubsequence {
   static int findLongestConseqSubseq(int arr[], int N)
	{
	    if(N==0){
	        return 0;
	    }
	    int count=1;
	    int max=1;
	   Arrays.sort(arr);
	    for(int i=0;i<N-1;i++){
	        if(arr[i]==arr[i+1]){
	            continue;
	        }
	        if(arr[i]==arr[i+1]-1){
	            count++;
	            max=Math.max(max,count);
	        }
	        else{
	            count=1;
	        }
	        
	    }
	    return max;
	}
    public static void main (String[] args) {
        int arr[]={42 ,37, 35 ,14 ,17,10,50 ,20, 44, 13, 4, 33, 12, 28 ,7 ,36 ,46 ,22 ,26, 21, 47, 18 ,31, 2, 5 ,34 ,9 ,45 ,16 ,32, 48 ,19 ,11 ,29, 27 ,39, 8, 49 ,43};
        System.out.println(findLongestConseqSubseq(arr,arr.length));
    }  

}
/*
 * /*
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
 