import java.util.*;
public class A47_RearrangeArrayInAlternatinPositiveAndNegativeItems{
    public static int[]reArrange(int arr[]){
        int n=arr.length;
        int temp=0;
        int temp1=0;
        for (int i = 0;i<n;++i){
            int check=arr[i];
            if(i%2==0){
                if(check<0){
                    continue;
                }
                else{
                    temp=check;
                    int index=i+1;
                while(index<n){
                    if(arr[index]<0){
                        temp1=arr[index];
                        while(index>i){
                            arr[index]=arr[index-1];
                            index--;
                        }
                        arr[i]=temp1;
                        arr[i+1]=temp;

                        break;
                    }  
                    
                    index++;
                }
            }
        }
            else{
                if(check>0){
                    continue;
                }
                else{
                    temp=check;
                    int index=i+1;
                while(index<n){
                    if(arr[index]>0){
                        temp1=arr[index];
                        while(index>i){
                            arr[index]=arr[index-1];
                            index--;
                        }
                        arr[i]=temp1;
                        arr[i+1]=temp;

                        break;
                    }   
                    index++;
                }
            }
            }
            }
            return arr;
        
        }
        
    
    public static void main(String args[]) {
        int arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
        reArrange(arr);
        for(int i: arr){
            System.out.println(i);
        }

    }
}






