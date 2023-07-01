import java.util.*;

class A59_TripletSumInArray {
    public static boolean find3Numbers(int arr[], int n, int X) {
        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == X) {
                    return true;
                } else if (sum < X) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1 ,4 ,45, 6 ,10 ,8};
        int X=13;
        if(find3Numbers(arr, arr.length, X)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

    }
}
