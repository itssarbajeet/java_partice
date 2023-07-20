
import java.util.*;
public class P03_CheckSorted {
    public static Boolean CheckSort(int []arr,int index){
        if(arr.length-1==index){
            return true;
    }
    if(!(arr[index]<arr[index+1])){
        return false;
    } 
    return CheckSort(arr, ++index);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,8};
        System.out.println(CheckSort(arr,0));
    }
} 