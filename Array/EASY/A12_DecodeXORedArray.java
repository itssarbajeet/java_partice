public class A12_DecodeXORedArray {
    public int[] decode(int[] encoded, int first) {
        int arr[]=new int[encoded.length +1];
        arr[0]=first;
        
        for(int i=1;i<encoded.length+1;i++){
            arr[i]=arr[i-1]^encoded[i-1];
        }
        return arr;

        
    }

    public static void main(String[] args) {
        A12_DecodeXORedArray solution = new A12_DecodeXORedArray();

        int[] encoded = {6,2,7,3};
        int first = 4;

        int[] decoded = solution.decode(encoded, first);

        System.out.println("Decoded array:");
        for (int num : decoded) {
            System.out.print(num + " ");
        }
    }
}


/*
 * Input: encoded = [1,2,3], first = 1
Output: [1,0,2,1]
Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
 */

