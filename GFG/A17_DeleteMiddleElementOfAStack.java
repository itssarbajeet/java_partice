import java.util.Stack;

public class A17_DeleteMiddleElementOfAStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        System.out.println("Stack before deleting middle element: " + stack);
        
        int size = stack.size();
        
        // Function call to delete middle element
        deleteMid(stack, size);
        
        System.out.println("Stack after deleting middle element: " + stack);
    }

    // Function to delete middle element of a stack.
    public static void deleteMid(Stack<Integer> s, int n) {
        int middle = (n / 2); // Calculate the middle index

        Stack<Integer> tempStack = new Stack<>();
        
        // Remove and store the middle element in a temporary stack
        for (int i = 0; i < middle; i++) {
            tempStack.push(s.pop());
        }
        
        // Skip the middle element
        s.pop();
        
        // Push back the elements from the temporary stack to the original stack
        while (!tempStack.isEmpty()) {
            s.push(tempStack.pop());
        }
    }
}
