package additionalTask;

public class Main {
    public static void main(String[] args) {
        String path = "src/main/java/certification/input.txt";
        Count count = new Count();
        count.count(path);
        Max max = new Max();
        max.max(path);
        NumberOfRepetitions numberOfRepetitions = new NumberOfRepetitions();
        numberOfRepetitions.NumberOfRepetitions(path);
    }
}
