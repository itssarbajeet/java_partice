class A18_CheckIfTwoStringArraysareEquivalent{
    public static void main(String[] args) {
        String[] word1 = {"abc", "def"};
        String[] word2 = {"abcdef"};
        A18_CheckIfTwoStringArraysareEquivalent solution = new A18_CheckIfTwoStringArraysareEquivalent();
        boolean areEqual = solution.arrayStringsAreEqual(word1, word2);
        System.out.println("Are equal: " + areEqual);
    } 
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for (String s : word1) {
            str1.append(s);
        }
        for (String s : word2) {
            str2.append(s);
        }
        return str2.toString().equals(str1.toString());
    }
} 
  