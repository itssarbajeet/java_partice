public class A28_SumOfMaxAndMinlementInAnArray {
    public static int findSum(int A[], int N) {
        int max = A[0];
        int min = A[0];

        for (int i = 1; i < N; i++) {
            if (max < A[i]) {
                max = A[i];
            }
            if (min > A[i]) {
                min = A[i];
            }
        }
        return min + max;
    }

    public static void main(String[] args) {
        int[] array = { 5, 2, 9, 1, 7 };
        int sum = findSum(array, array.length);
        System.out.println("Sum of the minimum and maximum values in the array: " + sum);
    }
}
