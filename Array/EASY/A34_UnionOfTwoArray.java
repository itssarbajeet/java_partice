public class A34_UnionOfTwoArray {
    public static int doUnion(int a[], int n, int b[], int m) {
        int[] occurrence = new int[100001]; // Assuming the maximum value in the arrays is 100000
        
        // Mark the elements from array 'a'
        for (int i = 0; i < n; i++) {
            occurrence[a[i]] = 1;
        }
        
        // Mark the elements from array 'b'
        for (int i = 0; i < m; i++) {
            occurrence[b[i]] = 1;
        }
        
        // Count the marked elements
        int count = 0;
        for (int i = 0; i < occurrence.length; i++) {
            if (occurrence[i] == 1) {
                count++;
            }
        }
        
        return count; // Return the count of unique elements
    }

    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5};
        int[] arrayB = {4, 5, 6, 7, 8};
        int count = doUnion(arrayA, arrayA.length, arrayB, arrayB.length);
        System.out.println("Number of unique elements: " + count);
    }
}


