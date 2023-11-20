package recursion.Lecture01;

public class factorial {
    public static int fact(int n){
        if(n==0|| n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        for (int i = 0; i <=5; i++) {

                    System.out.println(fact(i));

        }
    }
    
}
