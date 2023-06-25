import java.util.ArrayList;
public class A36_RotateAnArray {
    public static void rotate(int arr[], int n) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = n - 1; i < arr.length; i++) {
            arr1.add(arr[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            arr1.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr1.get(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotations = 2;

        System.out.println("Before rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        rotate(arr, rotations);

        System.out.println("\nAfter rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

