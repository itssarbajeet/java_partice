
public class A06_MiddleOfThree {
    class Solution {
        static int middle(int A, int B, int C) {
            int middle = A;
            if ((B < A && A < C) || (C < A && A < B)) {
                middle = A;
            } else if ((A < B && B < C) || (C < B && B < A)) {
                middle = B;
            } else if ((A < C && C < B) || (B < C && C < A)) {
                middle = C;
            } 
            return middle;
        }
        public static void main(String[] args) {
            int A=852;
            int B=963;
            int C=741;
            System.out.println(middle(A,B,C));
        }
    }
    
}
