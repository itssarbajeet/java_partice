import java.util.Arrays;

public class A05_FindMissingAndRepeating {
    public static class Solve {
        public int[] findTwoElement(int[] arr, int n) {
            int[] result = new int[2];
            int repeatingNum = -1;
            int missingNum = -1;

            for (int i = 0; i < n; i++) {
                int index = Math.abs(arr[i]) - 1;
                if (arr[index] < 0) {
                    repeatingNum = Math.abs(arr[i]);
                } else {
                    arr[index] = -arr[index]; 
                }
            }

            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    missingNum = i + 1;
                    break;
                }
            }

            result[0] = repeatingNum;
            result[1] = missingNum;

            return result;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 3};
        int size = arr.length;
        Solve solver = new Solve();
        int arr1[] = solver.findTwoElement(arr, size);
        System.out.println("Ans Array: " + Arrays.toString(arr1));
    }
}
