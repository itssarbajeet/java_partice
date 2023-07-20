
public class P01_ReverseANumber {
    static int arr=0;
    public static int reverse(int n,int digit){
        if(n%10==n){
        
            return n;
        }
        return n%10*(int)Math.pow(10,digit-1)+reverse(n/10, --digit) ;

    }
     public static void main(String args[]){

        System.out.println(reverse(1234,((int)Math.log10(1234)+1)));
    }
}
 