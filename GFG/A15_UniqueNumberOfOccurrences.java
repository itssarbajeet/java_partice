import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class A15_UniqueNumberOfOccurrences {
    class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        HashSet<Integer> uniqueFrequencies = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int frequency : frequencyMap.values()) {
            if (!uniqueFrequencies.add(frequency)) {
                return false;
            } 
        }

        return true;
    }
    public static void main(String[] args) {
        int N = 5;
        int [] arr = {1, 1, 2, 5, 5};
        if(isFrequencyUnique(N,arr)){
            System.out.println("True It has unique no of frequencies of element");
        }
        else{
            System.out.println("True It has unique no of frequencies of element");
        }

    }

}
}
