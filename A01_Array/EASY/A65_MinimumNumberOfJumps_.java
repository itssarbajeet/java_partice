public class A65_MinimumNumberOfJumps_ {
    class Solution {
        static int minJumps(int[] arr) {
            int n = arr.length;
            if (n <= 1)
                return 0;
            if (arr[0] == 0)
                return -1;
    
            int maxReach = arr[0];
            int steps = arr[0];
            int jumps = 1;
            int i = 1; 
            while (i < n) {
                if (i == n - 1)
                    return jumps;
    
                maxReach = Math.max(maxReach, i + arr[i]);
                steps--;
    
                if (steps == 0) {
                    jumps++;
                    if (i >= maxReach)
                        return -1;
                    steps = maxReach - i;
                }
    
                i++;
            }
    
            return -1;
        }
    }
    
}
