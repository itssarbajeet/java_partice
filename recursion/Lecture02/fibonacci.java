package recursion.Lecture02;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    public static int fib(int i) {
        if (i == 1 || i==0){
            return i;
        }
        return fib(i-1)+fib(i-2);
    }
}
