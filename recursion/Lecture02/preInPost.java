package recursion.Lecture02;

public class preInPost {
    public static void main(String[] args) {
        System.out.println();
        preInPost1(3);
    }

    private static void preInPost1(int i) {
        if(i==0)
        {
            return ;
        }
        System.out.print(i);
        preInPost1(i-1);
        System.out.print(i);
        preInPost1(i-1);
        System.out.print(i);
    }
}
