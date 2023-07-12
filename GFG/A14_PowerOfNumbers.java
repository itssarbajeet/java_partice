public class A14_PowerOfNumbers{
    class Solution {
        static long power(int N, int R) {
            long value = 1;
            long modulo = 1000000007;
            long base = N % modulo;
    
            while (R > 0) {
                if (R % 2 == 1) {
                    value = (value * base) % modulo;
                }
                base = (base * base) % modulo;
                R /= 2;
            }
    
            return value;
        }
        public static void main(String[] args) {
            System.out.println("Enter the number:" + power(12,21));
        }
    }
}