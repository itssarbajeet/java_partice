package recursion.Lecture01;

public class PrintName {
    public static void println (int n)
    {
        if(n==0){
            return;
        }
        System.out.println("fordward1");
        println(n-1);
        System.out.println("backward");

    }
    public static void main(String[] args){
        println(5);


    }
    
}
