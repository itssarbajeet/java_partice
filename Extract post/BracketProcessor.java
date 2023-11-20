import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class BracketProcessor {

    private static final int NUM_SETS = 1000;
    private static final int NUM_NUMBERS_PER_SET = 3;

    public static void main(String[] args) {
        // Specify the file path
        String outputFile = "C:\\Users\\sarba_lcvi2cc\\Java Partice\\Extract post\\output4.txt";

        try {
            // Generate and save 1000 sets of 3 random decimal numbers
            generateRandomSets(NUM_SETS, NUM_NUMBERS_PER_SET, outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateRandomSets(int numSets, int numNumbersPerSet, String filePath) throws IOException {
        Random random = new Random();

        try (FileWriter writer = new FileWriter(filePath)) {
            for (int i = 0; i < numSets; i++) {
                // Generate and save 3 random decimal numbers
                for (int j = 0; j < numNumbersPerSet; j++) {
                    double randomNumber = random.nextDouble();
                    writer.write(String.format("%.6f", randomNumber)); // Format with 6 decimal places
                    if (j < numNumbersPerSet - 1) {
                        writer.write(", "); // Separate numbers with a comma and space
                    }
                }

                writer.write("\n");
            }
            System.out.println("Random sets saved to: " + filePath);
        }
    }
}
