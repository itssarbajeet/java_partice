import java.util.Arrays;

class A53_FindTheMedian
{
    public static int find_median(int[] arr)
    {
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2==0){
            return (arr[(n/2)]+arr[(n/2)-1])/2;
            
        }
        else{
            return arr[(int)n/2];
        }
    }
    public static void main(String[] args) {
        // Example usage
        int[] array = {4, 2, 9, 6, 1, 5, 3, 8, 7};
        

        A53_FindTheMedian solution = new A53_FindTheMedian();
        

        // Print the partitioned array
        System.out.print(A53_FindTheMedian.find_median(array));
        
    } 
}

