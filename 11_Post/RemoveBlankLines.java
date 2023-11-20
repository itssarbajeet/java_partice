import java.io.*;

public class RemoveBlankLines {
    public static void main(String[] args) {
        String directoryPath = "C:/Users/sarba_lcvi2cc/Java Partice/11_Post/";
        removeBlankLinesFromFile(directoryPath + "alt.txt");
        removeBlankLinesFromFile(directoryPath + "paras.txt");
    }

    public static void removeBlankLinesFromFile(String fileName) {
        try {
            // Create a temporary file to write the modified content
            File tempFile = new File(fileName + "_temp");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tempFile));

            // Create a FileReader to read the input file
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Check if the line is not blank (contains non-whitespace characters)
                if (!line.trim().isEmpty()) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }
            }

            // Close the file readers and writers
            bufferedReader.close();
            bufferedWriter.close();

            // Delete the original file
            File originalFile = new File(fileName);
            originalFile.delete();

            // Rename the temporary file to the original file's name
            tempFile.renameTo(originalFile);

            System.out.println("Blank lines removed from " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("An error occurred while processing the file: " + fileName);
        }
    }
}
