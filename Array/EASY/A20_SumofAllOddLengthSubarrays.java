class A20_SumofAllOddLengthSubarrays{
    public static void main(String[] args) {
        A20_SumofAllOddLengthSubarrays solution = new A20_SumofAllOddLengthSubarrays();
        int[] arr = {1,4,2,5,3};
        int result = solution.sumOddLengthSubarrays(arr);
        System.out.println("Sum of odd-length subarrays: " + result);
    }

    public int sumOddLengthSubarrays(int[] arr) {
         int sum = 0;

        for (int len = 1; len <= arr.length; len += 2) {
            for (int i = 0; i <= arr.length - len; i++) {
                for (int j = i; j < i + len; j++) {
                    sum += arr[j];
                }
            }
        }

        return sum;
    }
}
        
/*
 * Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
Example 2:

Input: arr = [1,2]
Output: 3
Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.
 */

