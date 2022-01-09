import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Task1 {

    private static final String[] INPUT_DATA = { "Class", "Java", "Main", "unknown", "unknown", "variable", "example", "example", "example", "example", "simple", "field", "field"};


    public static void main(String[] args) {

        Map<String, Integer> frequencyByWord = new TreeMap<>();

        for (String word : INPUT_DATA) {
            Integer frequency = frequencyByWord.get(word);
            if (frequency == null) {
                frequency = 0;
            }
            frequencyByWord.put(word, ++frequency);
        }

        frequencyByWord.forEach((word, frequency) -> System.out.printf("%s : %d%n", word, frequency));
    }
}
