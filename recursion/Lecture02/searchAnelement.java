package recursion.Lecture02;

public class searchAnelement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("index of  element is "+searchElement(arr,9,0));

    }

    private static int searchElement(int[] arr, int i,int index) {
        if(arr[index]==i){
            return index;
        }
        else if(i==index){
            return -1;
        }
        
            return searchElement(arr, i, index+1);

    }
}
