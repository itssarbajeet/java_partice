public class A10_MaximumNumberofWordsFoundinSentences {
    public static void main(String[] args) {
        String[] sentences = {"I love coding", "Java is my favorite language", "Programming is fun"};
        A10_MaximumNumberofWordsFoundinSentences solution = new A10_MaximumNumberofWordsFoundinSentences();
        int mostWords = solution.mostWordsFound(sentences);
        System.out.println("Most words found in a sentence: " + mostWords);
    }
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] arr = sentences[i].split(" ");
            if (max < arr.length) {
                max = arr.length;
            }
        }
        return max;
    }
}
/*
 * Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
Explanation: 
- The first sentence, "alice and bob love leetcode", has 5 words in total.
- The second sentence, "i think so too", has 4 words in total.
- The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
 */