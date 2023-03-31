package ru.MVCtest4.dao;

import ru.MVCtest4.models.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDao {
    private List<Person> people;
    private static int PEOPLE_COUNT;

    {
        people = new ArrayList<>();
        people.add(new Person(PEOPLE_COUNT++, "Jack"));
        people.add(new Person(PEOPLE_COUNT++, "Nikolas"));
        people.add(new Person(PEOPLE_COUNT++, "Mike"));
        people.add(new Person(PEOPLE_COUNT++, "Marry"));
    }
        public List<Person> index(){
        return people;
    }
    public Person show (int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

}