public class A14_ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] restored = new char[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            restored[indices[i]] = s.charAt(i);
        }
        
        return new String(restored);
    }
    public static void main(String[] args) {
        A14_ShuffleString solution = new A14_ShuffleString();
        
        // Example usage
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        
        String restoredString = solution.restoreString(s, indices);
        System.out.println(restoredString);
    }
}
/*
 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
Example 2:
 */