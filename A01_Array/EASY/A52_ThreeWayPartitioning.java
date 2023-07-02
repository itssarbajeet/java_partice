    class A52_ThreeWayPartitioning {
    public void threeWayPartition(int array[], int a, int b) {
        int n = array.length;
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (array[mid] < a) {
                swap(array, low, mid);
                low++;
                mid++;
            } else if (array[mid] >= a && array[mid] <= b) {
                mid++;
            } else {
                swap(array, mid, high);
                high--;
            }
        }
    }
    public static void swap(int[] array, int i, int j) {
        if (i == j) return;

        array[i] = array[i] ^ array[j];
        array[j] = array[i] ^ array[j];
        array[i] = array[i] ^ array[j];
    }
    public static void main(String[] args) {
        // Example usage
        int[] array = {4, 2, 9, 6, 1, 5, 3, 8, 7};
        int a = 3;
        int b = 6;

        A52_ThreeWayPartitioning solution = new A52_ThreeWayPartitioning();
        solution.threeWayPartition(array, a, b);

        // Print the partitioned array
        System.out.print("Partitioned array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}




