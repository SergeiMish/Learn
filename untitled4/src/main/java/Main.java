import lombok.Getter;

import java.awt.*;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Word> words = List.of(
                Word.of("large", -3)

        );
        System.out.println(
                words.stream()
                        .filter(Predicate.not(Word::isBad))
                        .max(Comparator.comparing(Word::getPriority))
                        .map(Word::getValue)
                        .orElse("Nothing found")
        );
    }
    @AllAgrsConstructor
    @Getter
    public static class Word {
        private final String value;
        private final int priority;

        static Word of(String value, int priority){
            return new Word(value, priority);
        }
        public boolean isBad(){ return this.value.contains("La");}

    }
}
