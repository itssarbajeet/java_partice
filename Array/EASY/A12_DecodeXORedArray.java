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
 * 
 */

