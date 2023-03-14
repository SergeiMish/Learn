package ru.sergeimish.springapptest2;

import java.util.Collections;
import java.util.List;

public class RapMusic implements Music {
    @Override
    public List<String> getSong() {
        return Collections.singletonList("Lose yourself");
    }
}
