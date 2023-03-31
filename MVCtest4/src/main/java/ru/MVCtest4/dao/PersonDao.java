package ru.MVCtest4.dao;

import ru.MVCtest4.models.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDao {
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(1, "Jack"));
        people.add(new Person(2, "Nikolas"));
    }

}
