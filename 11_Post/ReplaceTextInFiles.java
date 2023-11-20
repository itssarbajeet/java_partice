import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReplaceTextInFiles {
    public static void main(String[] args) {
        try {
            // Specify the full paths to your files
            String imageLinksPath = "C:\\Users\\sarba_lcvi2cc\\Java Partice\\11_Post\\image_links.txt";
            String outputPath = "C:\\Users\\sarba_lcvi2cc\\Java Partice\\11_Post\\output.txt";
            String parasPath = "C:\\Users\\sarba_lcvi2cc\\Java Partice\\11_Post\\paras.txt";
            String altPath = "C:\\Users\\sarba_lcvi2cc\\Java Partice\\11_Post\\alt.txt";
            String answersPath = "C:\\Users\\sarba_lcvi2cc\\Java Partice\\11_Post\\answers.txt";

            // Read lines from image_links.txt
            List<String> imageLinksList = new ArrayList<>();
            BufferedReader imageLinksReader = new BufferedReader(new FileReader(imageLinksPath));
            String imageLinkLine;

            while ((imageLinkLine = imageLinksReader.readLine()) != null) {
                imageLinksList.add(imageLinkLine);
            }
            imageLinksReader.close();

            // Read lines from paras.txt
            List<String> parasList = new ArrayList<>();
            BufferedReader parasReader = new BufferedReader(new FileReader(parasPath));
            String paraLine;

            while ((paraLine = parasReader.readLine()) != null) {
                parasList.add(paraLine);
            }
            parasReader.close();

            // Read lines from alt.txt
            List<String> altList = new ArrayList<>();
            BufferedReader altReader = new BufferedReader(new FileReader(altPath));
            String altLine;

            while ((altLine = altReader.readLine()) != null) {
                altList.add(altLine);
            }
            altReader.close();

            // Ensure that we have at least 31 lines in parasList, imageLinksList, and altList
            while (parasList.size() < 31) {
                parasList.add(""); // Add empty lines if needed
            }

            while (imageLinksList.size() < 31) {
                imageLinksList.add(""); // Add empty lines if needed
            }

            while (altList.size() < 31) {
                altList.add(""); // Add empty lines if needed
            }

            // Read and modify the output.txt file
            BufferedReader outputReader = new BufferedReader(new FileReader(outputPath));
            StringBuilder modifiedContent = new StringBuilder();
            String outputLine;

            int imageIndex = 0;
            int paraIndex = 0;
            int altIndex = 0;

            while ((outputLine = outputReader.readLine()) != null) {
                // Replace the image src links in <img> tags
                if (outputLine.contains("<img src=") && imageIndex < imageLinksList.size()) {
                    String newImageSrc = "<img src=\"" + imageLinksList.get(imageIndex) + "\"";
                    // Add alt attribute with the content from alt.txt
                    String altAttribute = "alt=\"" + altList.get(altIndex) + "\"";
                    modifiedContent.append(outputLine.replaceFirst("<img src=\"[^\"]+\"", newImageSrc + " " + altAttribute)).append("\n");
                    imageIndex++;
                    altIndex++;
                }
                // Replace content in <p> tags
                else if (outputLine.contains("<p>") && paraIndex < parasList.size()) {
                    String paraContent = parasList.get(paraIndex);
                    modifiedContent.append("<p>").append(paraContent).append("</p>").append("\n");
                    paraIndex++;
                } else {
                    modifiedContent.append(outputLine).append("\n");
                }
            }
            outputReader.close();

            // Write the modified content to answers.txt
            PrintWriter answersWriter = new PrintWriter(new FileWriter(answersPath));
            answersWriter.print(modifiedContent);
            answersWriter.close();

            System.out.println("Replacement completed successfully. Results are saved in answers.txt.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
