package additionalTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Max {

private String path;

    public  void max(String path) {
        File file = new File(path);
        try (Scanner sc = new Scanner(new FileInputStream(file))) {
            int max = 0;

            while (sc.hasNext()) {
                if (sc.next().length() > max) {
                    max = sc.next().length();
                }
            }
            System.out.println("Max Length: " + max);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
