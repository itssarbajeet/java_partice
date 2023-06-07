/*
 * class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String o : operations) x += (44 - o.charAt(1));
        return x;
    }
    
}
value of the + 45 is and - is  43
 */
 
 //my logic 
 public class A04_FinalValueofVariableAfterPeformingOperations {
    public static void main(String[] args) {
        A04_FinalValueofVariableAfterPeformingOperations solution = new A04_FinalValueofVariableAfterPeformingOperations();
        
        String[] operations = {"++X", "--X", "X++", "++X"};
        int finalValue = solution.finalValueAfterOperations(operations);
        System.out.println("Final Value: " + finalValue);
    }
    
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                X++;
            } else if (operation.equals("--X") || operation.equals("X--")) {
                X--;
            }
        }
        return X;
    }
}
