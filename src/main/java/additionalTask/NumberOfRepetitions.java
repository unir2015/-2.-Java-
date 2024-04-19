package additionalTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class NumberOfRepetitions {

private String path;
    public void NumberOfRepetitions(String path) {
        File file = new File(path);
        Map<String, Integer> mp2 = new HashMap<String, Integer>();


        try (Scanner sc = new Scanner(new FileInputStream(file))) {
            String string = sc.nextLine();
            String[] words = string.split("\\s+");
            HashMap<String, Integer> wordToCount = new HashMap<>();
            for (String word : words)
            {
                if (!wordToCount.containsKey(word))
                {
                    wordToCount.put(word, 0);
                }
                wordToCount.put(word, wordToCount.get(word) + 1);
            }
            int max = 0;
            String name = "";
            for (String word : wordToCount.keySet()) {

                if (max < wordToCount.get(word)){
                    max = wordToCount.get(word);
                    name = word;
            }
            }
            System.out.printf(name + " : " + max);

        } catch(FileNotFoundException e){
                throw new RuntimeException(e);
            }
        }
    }

