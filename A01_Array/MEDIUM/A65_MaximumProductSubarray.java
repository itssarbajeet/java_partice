public class A65_MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr1 = {6, -3, -10, 0, 2}; // Output: 180
        int[] arr2 = {2, 3, 4, 5, -1, 0}; // Output: 120
        int[] arr3 = {1, 2, 3, 4, 5}; // Output: 120
        int[] arr4 = {-1, -2, -3, -4, -5}; // Output: 120
        int[] arr5 = {0, 0, 0, 0, 0}; // Output: 0 
        int[] arr6 = {1, -2, 3, -4, 5}; // Output: 120

        System.out.println("Max Product 1: " + maxProduct(arr1));
        System.out.println("Max Product 2: " + maxProduct(arr2));
        System.out.println("Max Product 3: " + maxProduct(arr3));
        System.out.println("Max Product 4: " + maxProduct(arr4));
        System.out.println("Max Product 5: " + maxProduct(arr5));
        System.out.println("Max Product 6: " + maxProduct(arr6));
    }

    public static long maxProduct(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return 0; // Empty array
        }

        long maxProduct = arr[0];
        long maxEndingHere = arr[0];
        long minEndingHere = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > 0) {
                maxEndingHere = Math.max(arr[i], arr[i] * maxEndingHere);
                minEndingHere = Math.min(arr[i], arr[i] * minEndingHere);
            } else if (arr[i] == 0) {
                maxEndingHere = 1;
                minEndingHere = 1;
                continue; // Skip the current element, as it will result in zero product
            } else {
                long temp = maxEndingHere;
                maxEndingHere = Math.max(arr[i], arr[i] * minEndingHere);
                minEndingHere = Math.min(arr[i], arr[i] * temp);
            }

            maxProduct = Math.max(maxProduct, maxEndingHere);
        }

        return maxProduct;
    }
}
