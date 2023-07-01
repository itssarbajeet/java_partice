class A60_SmallestSubarrayWithSumGreaterThanX {
    public static int smallestSubWithSum(int arr[], int n, int x) {
        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;

        while (right < n) {
            while (sum <= x && right < n) {
                sum += arr[right];
                right++;
            }
            if (sum > x) {
                minLen = Math.min(minLen, right - left);
            }
            while (sum > x && left < n) {
                minLen = Math.min(minLen, right - left);

                sum -= arr[left];
                left++;
            }
        }

        return (minLen != Integer.MAX_VALUE) ? minLen : 0;
    }
    public static void main(String[] args) {
        int arr[]={1, 4, 45, 6, 0, 19};
        System.out.println(smallestSubWithSum(arr, arr.length,51));

}
}
