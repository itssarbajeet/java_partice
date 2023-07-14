public class A16_ImplementTwoStacksInAnArray {
    public static class TwoStacks {
        int[] arr;
        int size;
        int top1, top2;

        TwoStacks() {
            size = 100;
            arr = new int[size];
            top1 = -1;
            top2 = size;
        }

        // Function to push an integer into stack1.
        void push1(int x) {
            if (top1 < top2 - 1) {
                top1++;
                arr[top1] = x;
            }
        }

        // Function to push an integer into stack2.
        void push2(int x) {
            if (top2 > top1 + 1) {
                top2--;
                arr[top2] = x;
            }
        }

        // Function to remove an element from the top of stack1.
        int pop1() {
            if (top1 >= 0) {
                int x = arr[top1];
                top1--;
                return x;
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        // Create an instance of the TwoStacks class
        TwoStacks stack = new TwoStacks();

        // Push elements into stack1
        stack.push1(10);
        stack.push1(20);
        stack.push1(30);

        // Push elements into stack2
        stack.push2(100);
        stack.push2(200);

        // Pop elements from stack1
        System.out.println(stack.pop1());  // Output: 30
        System.out.println(stack.pop1());  // Output: 20
    }
}
