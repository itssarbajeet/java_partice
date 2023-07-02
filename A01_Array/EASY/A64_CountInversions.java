public class A64_CountInversions {
    public static void main(String[] args) {
        long[] arr = { 5, 3, 8, 2, 1 };
        long count = inversionCount(arr, arr.length);
        System.out.println("Inversion count: " + count);
    }
    
    static long inversionCount(long arr[], long N) {
        return mergeSort(arr, 0, N - 1);
    }
    
    static long mergeSort(long[] arr, long low, long high) {
        long inversionCount = 0;
        
        if (low < high) {
            long mid = (low + high) / 2;
            
            inversionCount += mergeSort(arr, low, mid);
            inversionCount += mergeSort(arr, mid + 1, high);
            
            inversionCount += merge(arr, low, mid, high);
        }
        
        return inversionCount;
    }
    
    static long merge(long[] arr, long low, long mid, long high) {
        long[] temp = new long[(int)(high - low + 1)];
        long i = low, j = mid + 1, k = 0;
        long inversionCount = 0;
        
        while (i <= mid && j <= high) {
            if (arr[(int)i] <= arr[(int)j]) {
                temp[(int)k++] = arr[(int)i++];
            } else {
                temp[(int)k++] = arr[(int)j++];
                inversionCount += mid - i + 1;
            }
        }
        
        while (i <= mid) {
            temp[(int)k++] = arr[(int)i++];
        }
        
        while (j <= high) {
            temp[(int)k++] = arr[(int)j++];
        }
        
        for (i = low; i <= high; i++) {
            arr[(int)i] = temp[(int)(i - low)];
        }
        
        return inversionCount;
    }
}
