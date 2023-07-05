public class A08_MinNumberOfFlips {
    public static int minFlips(String S) {
        int count0 = 0;
        int count1 = 0;
        
        // Check for alternating pattern starting with 0
        for (int i = 0; i < S.length(); i++) {
            if (i % 2 == 0 && S.charAt(i) != '0') {
                count0++;
            } else if (i % 2 == 1 && S.charAt(i) != '1') {
                count0++;
            }
        }
        
        // Check for alternating pattern starting with 1
        for (int i = 0; i < S.length(); i++) {
            if (i % 2 == 0 && S.charAt(i) != '1') {
                count1++;
            } else if (i % 2 == 1 && S.charAt(i) != '0') {
                count1++;
            }
        }
        
        // Return the minimum number of flips required
        return Math.min(count0, count1);
    }
    public static void main(String[] args) {
        String s="0011";
        System.out.println("Minimum Number Of Flips: " + minFlips(s));
    }
}
