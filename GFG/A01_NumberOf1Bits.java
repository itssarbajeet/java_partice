
public class A01_NumberOf1Bits {
    static int setBits(int N) {
        int count = 0;
        while (N != 0) {
            if ((N & 1) == 1) {
                count++;
            }
            N = N >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Number of bits in a number: " +setBits(2));
        }
    
}
