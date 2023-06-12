public class A21_TruncateSentence {
    public String truncateSentence(String s, int k) {
        int count = 0;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
            if (count == k) {
                break;
            }
            str.append(s.charAt(i));
        }
        return str.toString();
    }

    public static void main(String[] args) {
        A21_TruncateSentence solution = new A21_TruncateSentence();
        String s = "This is a sample sentence.";
        int k = 3;
        String truncatedSentence = solution.truncateSentence(s, k);
        System.out.println(truncatedSentence);
    }
}
/*
 * Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".
Example 2:

Input: s = "What is the solution to this problem", k = 4
Output: "What is the solution"
Explanation:
The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].
The first 4 words are ["What", "is", "the", "solution"].
Hence, you should return "What is the solution".
Example 3:

Input: s = "chopper is not a tanuki", k = 5
Output: "chopper is not a tanuki"
 */
