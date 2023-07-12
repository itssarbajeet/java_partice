public class A13_ArithmeticNumber {
    class Solution {
        static int inSequence(int A, int B, int C) {
            if(A==B){
                return 1;
            }
            if (C == 0) {
                if (A == B) {
                    return 1; // A and B are equal, so it is a sequence
                } else {
                    return 0; // A and B are different, not a sequence
                }
            }
    
            if ((A < B && C > 0) || (A > B && C < 0)) {
                int difference = B - A;
                if (difference % C == 0) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        }
        public static void main(String[] args) {
            System.out.println("inSequence: " + inSequence(10,10,42));
        }
    }
    
}
