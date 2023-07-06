public class A05_IsomorphicStrings {
    public static boolean areIsomorphic(String str1,String str2)
    {
        char Char1[] = new char[26];
        char Char2[] = new char[26];

        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 != len2) {
            return false;
        }
        for (int i = 0; i < len1; i++) {
            Char1[str1.charAt(i) - 'a']++;
            Char2[str2.charAt(i) - 'a']++;
        }
        if (Char1.length != Char2.length) {
            return false;
        } else {
            for (int i = 0; i < str1.length() - 1; i++) {
                if (str1.charAt(i) == str1.charAt(i + 1) && str2.charAt(i) == str2.charAt(i + 1)) {
                    continue;
                } else if ((str1.charAt(i) == str1.charAt(i + 1) && str2.charAt(i) != str2.charAt(i + 1))
                        || (str1.charAt(i) != str1.charAt(i + 1) && str2.charAt(i) == str2.charAt(i + 1))) {
                    return false;
                } else if (Char1[str1.charAt(i) - 'a'] != Char2[str2.charAt(i) - 'a']) {
                    return false;
                }
            }
        } 
        return true;
    }
    public static void main(String[] args) {
        String s1="egg";
        String s2="add";
        System.out.println("Are the two strings isomorphic :  "+areIsomorphic(s1,s2));
    }
}
