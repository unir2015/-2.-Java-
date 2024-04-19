package additionalTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Count {
    private String path;
    public  void count(String path) {
        File file = new File(path);
        try (Scanner sc = new Scanner(new FileInputStream(file))) {
            int count = 0;

            while (sc.hasNext()) {
                sc.next();
                count++;
            }
            System.out.println("Number of input.txt: " + count);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
