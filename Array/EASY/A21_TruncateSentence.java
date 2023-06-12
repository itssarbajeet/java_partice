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
