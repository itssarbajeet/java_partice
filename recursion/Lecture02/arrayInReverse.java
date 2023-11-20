package recursion.Lecture02;

public class arrayInReverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        printReverse(arr,arr.length);
    }

    private static void printReverse(int[] arr, int length) {
        if(length-1==-1){
            return;
        }
        System.out.println(arr[length-1]);
        printReverse(arr, length-1);
    }
}
