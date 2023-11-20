package recursion.Lecture02;

public class stair3jumpways {
    public static void main(String[] args) {
        System.out.println(startways(5));
        
    }

    private static int startways(int i) {
        if(i==3){
            return 3;
        }
        if(i==1 || i==2){
            return i;
        }
        return startways(i-1)+startways(i-2)+startways(i-3);

    }
}
