import java.util.ArrayList;

    class A61_FactorialsOfLargeNumbers {
    static ArrayList<Integer> factorial(int N) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] fact = new int[10000]; // Use an array to store the factorial
        fact[0] = 1;
        int len = 1;

        for (int i = 2; i <= N; i++) {
            len = multiply(i, fact, len);
        }

        for (int i = len - 1; i >= 0; i--) {
            arr.add(fact[i]);
        }

        return arr;
    }

    static int multiply(int x, int[] arr, int len) {
        int carry = 0;

        for (int i = 0; i < len; i++) {
            int prod = arr[i] * x + carry;
            arr[i] = prod % 10;
            carry = prod / 10;
        }

        while (carry != 0) {
            arr[len] = carry % 10;
            carry = carry / 10;
            len++;
        }

        return len;
    }
    public static void main(String[] args) {
    ArrayList<Integer> arr = factorial(5);
    System.out.print("\nThe factorial of a number is: ");
    for (int i : arr) {
        System.out.print(i);
    }
    
}

}
