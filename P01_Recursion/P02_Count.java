
public class P02_Count {
    public static int count(int n,int count, int digit){
        
        if(digit==0){
            return count;
        }
        if(n==0){
            return digit;
        } 
        if(n%10==0){ 
            return (count(n/10,++count,--digit));
        }
        else{
            return count(n/10,count,--digit);
        }
    }
    public static void main(String args[]){
        int s=10;
        System.out.println(count(s,0,((int)Math.log10(s)+1)));
    }
}
