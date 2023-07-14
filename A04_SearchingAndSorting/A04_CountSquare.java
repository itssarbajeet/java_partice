
public class A04_CountSquare {
    class Solution {
        static int countSquares(int N) {
            int count = 0;
            int sqrt = (int) Math.sqrt(N);
            
            if (sqrt * sqrt == N) {
                sqrt--;
            }
            
            for (int i = 1; i <= sqrt; i++) {
                count++;
            }
            
            return count;
        }
     
    public static void main(String[] args) {
        System.out.println("Number of squares in a given range: " + countSquares(15));
    }
}
}
 