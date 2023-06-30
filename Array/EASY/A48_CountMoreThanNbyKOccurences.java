public class A48_CountMoreThanNbyKOccurences {
    //Function to find all elements in array that appear more than n/k times.
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
