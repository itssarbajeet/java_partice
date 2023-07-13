public class A05_StockBuyAndSell2 {
    public static int stockBuyAndSell(int n, int[] arr) {
         int sum=0;
         for(int i=0;i<n-1;i++){
             if(arr[i]<arr[i+1]){
                 sum+=arr[i+1]-arr[i];
             }
             else{
                 continue;
             }
         }
         return sum;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,5,1,6};
        System.out.println("Maximum profit is "+stockBuyAndSell(arr.length,arr));
    } 
} 
         

  