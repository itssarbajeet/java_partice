
public class P04_MergeSort {
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 6, 9};
        int ans[] = mergeSort(arr);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeSort(int[] arr) {
        int length = arr.length; 
        if (length == 1) {
            return arr;
        }
        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, length - mid);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int leftLength = left.length;
        int rightLength = right.length;
        int mergedLength = leftLength + rightLength;
        int[] merged = new int[mergedLength];

        int i = 0, j = 0, k = 0;
        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        while (i < leftLength) {
            merged[k++] = left[i++];
        }

        while (j < rightLength) {
            merged[k++] = right[j++];
        }

        return merged;
    }
}



