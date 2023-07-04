public class A02_PalindromeString {
    static int isPalindrome(String S) {
        for (int i = 0; i < S.length() / 2; i++) {
            if (!(S.charAt(i) == S.charAt(S.length() - i - 1))) {
                return 0;
            }
        }
    
        return 1;
    }
    public static void main(String[] args) {
        String s="racecar"; 
        System.out.println("Is Palindrome: "+ isPalindrome(s) );

    }
}
