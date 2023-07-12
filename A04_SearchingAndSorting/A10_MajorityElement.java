import java.util.Arrays;

public class A10_MajorityElement {
    class Solution
{
    static int majorityElement(int a[], int size)
    {
        int major=size/2;
        Arrays.sort(a);
        if(size==1){
            return a[0];
        }
        if (size==0){
            return -1;
        }
        for(int i=0;i<size;i++){
            int count=1;
            while(i<size-1 && a[i]==a[i+1] ){
                count++;
                i++;
                if(count>major){
                    return a[i];
                }
            }
        }
        return -1;
        
    }
    public static void main(String[] args){
        int N = 3 ;
        int A[] = {1,3,3}; 
        System.out.println("The Majority Element is " + majorityElement(A,N));
    }
}
}
