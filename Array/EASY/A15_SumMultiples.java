public class A15_SumMultiples {
    public static void main(String[] args) {
        int n = 7;
        A15_SumMultiples solution = new A15_SumMultiples();
        int sum = solution.sumOfMultiples(n);
        System.out.println("The sum of multiples of 3, 5, or 7 up to " + n + " is: " + sum);
    } 
    public int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    } 
} 
/*
 * Input: n = 7
Output: 21
Explanation: Numbers in the range [1, 7] that are divisible by 3, 5, or 7 are 3, 5, 6, 7. The sum of these numbers is 21.
 */
