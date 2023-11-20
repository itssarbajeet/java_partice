import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BracketGenerator {

    public static void main(String[] args) {
        // Specify the desired file path
        String outputFile = "C:\\Users\\sarba_lcvi2cc\\Java Partice\\Extract post\\output2.txt";

        // Generate and save 500 balanced examples
        List<String> balancedExamples = generateBalancedExamples(500);

        // Generate and save 500 unbalanced examples
        List<String> unbalancedExamples = generateUnbalancedExamples(500);

        // Combine both lists
        List<String> allExamples = new ArrayList<>();
        allExamples.addAll(balancedExamples);
        allExamples.addAll(unbalancedExamples);

        // Shuffle the examples
        Collections.shuffle(allExamples);

        // Save all examples to the specified file
        saveToFile(allExamples, outputFile);
    }

    private static void saveToFile(List<String> examples, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (String example : examples) {
                writer.write(example + "\n");
            }
            System.out.println("Output saved to: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> generateBalancedExamples(int count) {
        List<String> examples = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            examples.add(generateBalancedSequence());
        }
        return examples;
    }

    private static String generateBalancedSequence() {
        List<Character> brackets = new ArrayList<>();
        brackets.add('(');
        brackets.add(')');
        brackets.add('{');
        brackets.add('}');
        brackets.add('[');
        brackets.add(']');

        // Shuffle the brackets
        Collections.shuffle(brackets);

        StringBuilder balancedSequence = new StringBuilder();
        int length = brackets.size() * 2; // Ensure balanced brackets
        for (int i = 0; i < length; i++) {
            balancedSequence.append(brackets.get(i % brackets.size()));
        }

        return balancedSequence.toString();
    }

    private static List<String> generateUnbalancedExamples(int count) {
        List<String> examples = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            examples.add(generateUnbalancedSequence());
        }
        return examples;
    }

    private static String generateUnbalancedSequence() {
        List<Character> openingBrackets = new ArrayList<>();
        openingBrackets.add('(');
        openingBrackets.add('{');
        openingBrackets.add('[');

        List<Character> closingBrackets = new ArrayList<>();
        closingBrackets.add(')');
        closingBrackets.add('}');
        closingBrackets.add(']');

        Random random = new Random();
        int length = random.nextInt(19) + 2; // Random length between 2 and 20

        StringBuilder unbalancedSequence = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int openingIndex = random.nextInt(openingBrackets.size());
            int closingIndex = random.nextInt(closingBrackets.size());
            unbalancedSequence.append(openingBrackets.get(openingIndex));
            unbalancedSequence.append(closingBrackets.get(closingIndex));
        }

        return unbalancedSequence.toString();
    }
}
