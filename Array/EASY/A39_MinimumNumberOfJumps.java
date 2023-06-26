class A39_MinimumNumberOfJumpsjava {
    static int minJumps(int[] arr) {
        int count = 1;
        int curr = arr[0];
        while (curr < arr.length) {
            if (arr[curr] <= 0) {
                return -1;
            }
            curr = curr + arr[curr];
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};
        int minJumps = minJumps(arr);
        System.out.println("Minimum number of jumps: " + minJumps);
    }
}
