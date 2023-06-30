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
