package recursion.Lecture01;
import java.util.*;

public class printNto1 {
    public static void println(int n){
        if(n==1){
        System.out.println(""+n+" ");

            return;
        }
        System.out.println(""+n+" ");
        println(n-1);

    }
    public static void main(String[] args) {
        System.out.print(" enter the number: ");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        println(n);
    }
    
}
