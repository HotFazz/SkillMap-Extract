// REPOBEE-SANITIZER-SHRED
import java.util.HashMap;

/**
 * A file to analyze text
 * @author Linus Östlund
 */
public class FileTextAnalyzer {
    private FileWordSplitter words;
    private HashMap<String, Integer> wordOccurrences;

    public FileTextAnalyzer(String filename) {
        wordOccurrences = new HashMap<>();

        // Create a new FileWordSplitter (FWS)
        words = new FileWordSplitter(filename);

        // Iterate over all words in the FWS
        for (String word : words.getWords()) {
            // If it is the first occurrence, set value to 1
            word = word.toLowerCase();
            if(!wordOccurrences.containsKey(word)) {
                wordOccurrences.put(word, 1);
            } else {
                // Otherwise, increment the current value
                int oldValue = wordOccurrences.get(word);
                wordOccurrences.put(word, oldValue + 1);

                // Alternate solution:
                // wordOccurrences.merge(word, 1, Integer::sum);
            }
        }
    }

    /**
     * Get the number of words in the text file
     * @return number of words
     */
    public int wordCount() {
        return words.getWords().size();
    }

    /**
     * Get the HashMap containing all word occurrences
     * @return HashMap of all word occurrences
     */
    public HashMap<String, Integer> getWordOccurrences() {
        return wordOccurrences;
    }

    /**
     * Return the number of occurrences of word
     * @param word the word to count occurrences of
     * @return the number of times the word is present in the file
     */
    public int occurrencesOf(String word) {
        word = word.toLowerCase();
        if (!wordOccurrences.containsKey(word)) {
            return 0;
        } else {
            return wordOccurrences.get(word);
        }
    }

    /**
     * A method to find the frequency words in the file
     * @param word the word to get the frequency of
     * @return The number of times the word is present divided by the number of words in the file
     */
    public double frequencyOf(String word) {
        word = word.toLowerCase();
        if (wordOccurrences.containsKey(word)) {
            // If the word is in the corpus, return the frequency of it
            double occurrencesOfWord = occurrencesOf(word);
            double totalAmountOfWords = wordCount();
            return occurrencesOfWord / totalAmountOfWords;
        } else {
            return 0;
        }
    }

    /**
     * Find out how many unique word the input file has
     * @return the size of HashMap's key set
     */
    public int uniqueWordCount() {
        return wordOccurrences.keySet().size();
    }
}