// REPOBEE-SANITIZER-SHRED
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Sample solution for the File Word Splitter class
 * @author Linus Östlund
 */
public class FileWordSplitter {
    private ArrayList<String> words;

    /**
     * The constructor takes the name of a file and iterate over all words.
     * Requires tidy data with not delimiters other than '/n' and ' ' (whitespace)
     * @param filename name of the file. NOTE: has to be in the same folder
     * @throws IOException if something goes wrong while reading the file
     */
    public FileWordSplitter(String filename) {

        // Initialize the ArrayList
        words = new ArrayList<>();

        try {
            // Attempt to open a text file
            BufferedReader file = new BufferedReader(new FileReader(filename));

            // Try to read the first line of the file
            String line = file.readLine();

            // Keep reading while there are lines left
            while (line != null) {
                // NOTE: input has to be tidy and only have whitespace as delimiters
                for (String word : line.split(" ")) {
                    words.add(word);
                }

                // read the next line
                line = file.readLine();
            }

            // Don't forget to close the file!
            file.close();

        // Handle any errors that come up, such as the file not existing
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            // Exit the program
            System.exit(1);
        }
    }

    /**
     * Getter for the ArrayList of words
     * @return the whitespace separated words
     */
    public ArrayList<String> getWords() {
        return words;
    }
}