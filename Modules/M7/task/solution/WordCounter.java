// REPOBEE-SANITIZER-SHRED
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WordCounter {

    HashMap<String, Integer> wordCounter;
    ArrayList<String> words;

    public WordCounter(File fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(fileName);
        this.words = new ArrayList<>();
        while(sc.hasNextLine()) {
            this.words.add(sc.nextLine());
        }
        sc.close();
    }

    public ArrayList<String> getWords(){
        return this.words;
    }

    public static void main(String[] args) throws FileNotFoundException {
        WordCounter wc = new WordCounter(new File("hamlet.txt"));
        System.out.println(wc.getWords());
    }
}