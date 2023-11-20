import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

public class BracketChecker {

    public static void main(String[] args) {
        String inputFile = "C:\\Users\\sarba_lcvi2cc\\Java Partice\\Extract post\\output2.txt";
        String outputFile = "C:\\Users\\sarba_lcvi2cc\\Java Partice\\Extract post\\output3.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile);

            String line;
            while ((line = reader.readLine()) != null) {
                boolean isBalanced = isBalanced(line);
                String result = isBalanced ? "balanced," : "unbalanced,";
                writer.write(result + "\n");
            }

            reader.close();
            writer.close();

            System.out.println("Output saved to: " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isBalanced(String sequence) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : sequence.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else if (bracket == ')' || bracket == '}' || bracket == ']') {
                if (stack.isEmpty() || !isMatching(stack.pop(), bracket)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatching(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }
}
