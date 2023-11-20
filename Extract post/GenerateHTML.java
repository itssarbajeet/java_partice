import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateHTML {

    public static void main(String[] args) {
        String inputFile = "C:\\Users\\sarba_lcvi2cc\\Java Partice\\Extract post\\output5.txt";
        String outputFile = "C:\\Users\\sarba_lcvi2cc\\Java Partice\\Extract post\\output.html";

        generateHTML(inputFile, outputFile);
    }

    private static void generateHTML(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            writer.write("<!DOCTYPE html>\n");
            writer.write("<html>\n");
            writer.write("<head>\n");
            writer.write("<title>Expression Report</title>\n");
            // Add CSS style for font size
            writer.write("<style>body { font-size: 20px; }</style>\n");
            writer.write("<style>p { min-height: 22px; font-size: inherit; }</style>\n");
            writer.write("</head>\n");
            writer.write("<body>\n");

            // Heading
            writer.write("<h1>Expression Report</h1>\n");

            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into expression, stack, queue, and deque values
                String[] parts = line.split(" ");
                if (parts.length >= 5) {
                    String expression = parts[0];
                    String status = isBalanced(expression) ? "balanced" : "unbalanced";

                    try {
                        double stackValue = Double.parseDouble(parts[2].replace(",", ""));
                        double queueValue = Double.parseDouble(parts[3].replace(",", ""));
                        double dequeValue = Double.parseDouble(parts[4].replace(",", ""));

                        // Write the formatted example to the HTML file
                        writer.write("<div>\n");
                        writer.write("<p><strong>Expression:</strong> " + expression + "</p>\n");
                        writer.write("<p><strong>Status:</strong> " + status + "</p>\n");
                        writer.write("<p><strong>Stack:</strong> " + stackValue + "</p>\n");
                        writer.write("<p><strong>Queue:</strong> " + queueValue + "</p>\n");
                        writer.write("<p><strong>Deque:</strong> " + dequeValue + "</p>\n");
                        writer.write("</div>\n");

                        writer.write("<hr>\n"); // Add a horizontal line between examples
                    } catch (NumberFormatException e) {
                        System.err.println("Error parsing double values in line: " + line);
                    }
                } else {
                    System.err.println("Invalid format in line: " + line);
                }
            }

            writer.write("</body>\n");
            writer.write("</html>");

            System.out.println("HTML file generated successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isBalanced(String expression) {
        // Implement your logic to check if the expression is balanced or not
        // For simplicity, let's assume an expression is balanced if the number of opening and closing brackets is equal
        int count = 0;
        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                count++;
            } else if (ch == ')' || ch == ']' || ch == '}') {
                count--;
            }
            if (count < 0) {
                return false; // Unbalanced if closing bracket is encountered without a corresponding opening bracket
            }
        }
        return count == 0;
    }
}
