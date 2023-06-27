import java.util.*;

public class A45_CountPairsWithGivenSum {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the length of the array: ");
            int n = scanner.nextInt();
            System.out.print(" Enter the target element :");
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int ans = new A45_CountPairsWithGivenSum().getPairsCount(arr, n, k);
            System.out.println(ans);
        
        scanner.close();
    }

    int getPairsCount(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int count = 0;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == k) {
                if (arr[left] == arr[right]) {
                    int frequency = right - left + 1;
                    count += (frequency * (frequency - 1)) / 2;
                    break;
                } else {
                    int leftFrequency = 1;
                    while (left + 1 < right && arr[left] == arr[left + 1]) {
                        left++;
                        leftFrequency++;
                    }

                    int rightFrequency = 1;
                    while (right - 1 > left && arr[right] == arr[right - 1]) {
                        right--;
                        rightFrequency++;
                    }

                    count += (leftFrequency * rightFrequency);
                    left++;
                    right--;
                }
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }

}

