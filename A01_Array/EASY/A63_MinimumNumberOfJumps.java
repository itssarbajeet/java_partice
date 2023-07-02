public class A63_MinimumNumberOfJumps {
    
    public static int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return 0; // if the array is empty or has only one element, no jumps are needed

        if (arr[0] == 0)
            return -1; // if the first element is 0, we can't reach the end

        int maxReach = arr[0]; // maximum index that can be reached from the current element
        int steps = arr[0]; // number of steps remaining at the current element
        int jumps = 1; // minimum number of jumps required

        for (int i = 1; i < n; i++) {
            if (i == n - 1)
                return jumps; // reached the last element, return the minimum jumps

            maxReach = Math.max(maxReach, i + arr[i]); // update the maximum reachable index

            steps--; // decrement the number of steps remaining

            if (steps == 0) {
                jumps++; // jump to the next maximum reachable index
                if (i >= maxReach)
                    return -1; // if the current index cannot be reached, return -1
                steps = maxReach - i; // update the steps remaining
            }
        }

        return -1; // if the last element cannot be reached, return -1
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println("Minimum number of jumps: " + minJumps(arr));
    }
}


