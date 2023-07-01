public class A54_PalindromicArray {
    public static int palinArray(int[] a, int n) {
    boolean check = true;
    for (int i = 0; i < n; i++) {
        String temp = String.valueOf(a[i]);
        for (int j = 0; j < (temp.length() / 2); j++) {
            if (temp.charAt(j) != temp.charAt(temp.length() - 1 - j)) {
                check = false;
                break;
            }
        }
    }
    if (check) {
        return 1;
    } else {
        return 0;
    }
}
public static void main (String args[]){
    int []arr={111,222,333,454,565};
    System.out.println("palindrome array is "+palinArray(arr, arr.length));

}
}
