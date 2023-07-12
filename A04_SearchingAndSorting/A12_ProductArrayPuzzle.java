public class A12_ProductArrayPuzzle {
    class Solution {
        public static long[] productExceptSelf(int nums[], int n) {
            long arr[] = new long[n];
            long pro = 1;
            int count=0;
    
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    count++;
    
                    continue;
                } else {
                    pro *= nums[i];
                }
            }
    
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    if(count>1){
                        arr[i]=0;
                    }
                    else{
                    arr[i] = pro;
                    }
                } else {
                    if(count>0){
                        arr[i] = 0;
                    }
                    else{
                    arr[i] = (long) pro / nums[i];
                }
            }
            }
    
            return arr;
        }
        public static void main(String[] args) {
            int nums[]={1,2,3,4,5,6,0,0,7,9,0};
            int n=nums.length;
            long arr[]=productExceptSelf(nums,n);
            for(long i :arr){
                System.out.print(i+" ");
            }
        }
    }
    
}
