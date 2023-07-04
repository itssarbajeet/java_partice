public class A03_PrintAllTheDuplicatesInTheInputString {
    public static void DuplicateElements(String s){
        int[] arr = new int[26]; 
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                System.out.println((char)(i + 'A') + " " + arr[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        String s = "SARBAJEET";
        DuplicateElements(s);
    }
}
