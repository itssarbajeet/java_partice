package recursion.Lecture01;

public class tureIfPow2 {
    public static void main(String[] args) {
        System.out.println(checkpow(32));
    }

    public static boolean checkpow(int i) {
        if(i==1){
            return true;
        }
        if(i%2!=0){
            return false;
        }
        return checkpow(i>>1);
    }
    
}
