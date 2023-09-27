import java.awt.*;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Word> words = List.of(
                Word.of("large", -3)

        );
        System.out.println(
                words.stream()
                        .filter(Predicate.not(Word::))
                        .max((C))
        );
    }
}
