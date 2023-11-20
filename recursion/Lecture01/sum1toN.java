package recursion.Lecture01;

public class sum1toN {
    //witrhout return type
    public static void printSum(int sum,int n){
        if(n==0){ 
            System.out.println(sum);
            return ;
      }
      printSum(sum+n,n-1);


    }

    //with return type
        public static int printSum1(int n){
            if(n==1){
                return 1;
            }
            return n+ printSum1(n-1);
            
        }

    public static void main(String[] args) {
        printSum(0,05);
        System.out.println(printSum1(5));
    }
}
