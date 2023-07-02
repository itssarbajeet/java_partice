public class A57_TrappingRainWater {
    static long trappingWater(int arr[], int n) {
        if (arr == null || n <= 2) {
            return 0;
        }

        int left = 0, right = n - 1;

        int leftMax = 0, rightMax = 0;
        long waterTrapped = 0;

        while (left < right) {
            if (arr[left] < 0 || arr[right] < 0) {
                return 0;
            }

            if (arr[left] < arr[right]) {
                if (arr[left] > leftMax) {
                    leftMax = arr[left];
                } else {
                    waterTrapped += leftMax - arr[left];
                }
                left++;
            } else {
                if (arr[right] > rightMax) {
                    rightMax = arr[right];
                } else {
                    waterTrapped += rightMax - arr[right];
                }
                right--;
            }
        }

        return waterTrapped;
    }
    public static void main(String[] args) {
        int arr[]={3,0,0,2,0,4};
        System.out.println("water Trapped: "+trappingWater(arr,arr.length));
    }
}

