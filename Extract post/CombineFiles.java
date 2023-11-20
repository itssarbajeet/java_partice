import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CombineFiles {

    public static void main(String[] args) {
        String inputFile2 = "C:\\Users\\sarba_lcvi2cc\\Java Partice\\Extract post\\output2.txt";
        String inputFile3 = "C:\\Users\\sarba_lcvi2cc\\Java Partice\\Extract post\\output3.txt";
        String inputFile4 = "C:\\Users\\sarba_lcvi2cc\\Java Partice\\Extract post\\output4.txt";
        String outputFile = "C:\\Users\\sarba_lcvi2cc\\Java Partice\\Extract post\\output5.txt";

        combineLines(inputFile2, inputFile3, inputFile4, outputFile, 1000);
    }

    private static void combineLines(String inputFile2, String inputFile3, String inputFile4, String outputFile, int numLines) {
        try (BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
             BufferedReader reader3 = new BufferedReader(new FileReader(inputFile3));
             BufferedReader reader4 = new BufferedReader(new FileReader(inputFile4));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            for (int i = 0; i < numLines; i++) {
                // Read the ith line from output2.txt
                String line2 = reader2.readLine();
                if (line2 != null) {
                    writer.write(line2);
                    if (!isBalanced(line2)) {
                        // If unbalanced, write three "0.00"
                        writer.write(" 0.00 0.00 0.00");
                        writer.newLine();
                        continue; // Move to the next iteration
                    }
                }

                // Read the ith line from output3.txt and append to output5.txt
                String line3 = reader3.readLine();
                if (line3 != null) {
                    writer.write(" " + line3);
                } else {
                    writer.write(" 0.00");
                }

                // Read the ith line from output4.txt and append to output5.txt
                String line4 = reader4.readLine();
                if (line4 != null) {
                    writer.write(" " + line4);
                } else {
                    writer.write(" 0.00");
                }

                writer.newLine(); // Add a new line after each set of lines
            }

            System.out.println("Combining and writing to output5.txt successful.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isBalanced(String line) {
        // Implement your logic to check if the line is balanced
        // For example, you can use a stack to check for balanced parentheses
        // Replace the implementation below with your own logic
        return true;
    }
}
