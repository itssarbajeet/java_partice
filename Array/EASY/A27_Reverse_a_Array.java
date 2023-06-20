import java.util.Arrays;

public class A27_Reverse_a_Array {
        public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        A27_Reverse_a_Array solution = new A27_Reverse_a_Array();
        
        // Example usage
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        solution.reverseString(arr);
        
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
    

