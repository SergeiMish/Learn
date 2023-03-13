package ru.sergeimish.springapptest2;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
        private List<String> rockStyle
            rockStyle.add("Song of Silents");
            rockStyle.add("Invaders must die");
            rockStyle.add("Mutter");

        Random random = new Random();
        return musicStile.get(random.nextInt(musicStile.size()));
    }
    public String getSong() {
        return "Kollizium";
    }
}
