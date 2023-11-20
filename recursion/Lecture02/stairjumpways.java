package recursion.Lecture02;

public class stairjumpways {
    
    public static void main(String[] args) {
        System.out.println(startways(3));
        
    }

    private static int startways(int i) {
        if(i==2){
            return 2;
        }
        if(i==1){
            return 1;
        }
        return startways(i-1)+startways(i-2);

    }
    
}
