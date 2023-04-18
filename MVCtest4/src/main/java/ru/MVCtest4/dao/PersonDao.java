package ru.MVCtest4.dao;

import org.springframework.stereotype.Component;
import ru.MVCtest4.models.Person;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDao {
    private final List<Person> people;
    private static int PEOPLE_COUNT;
    public PersonDao(List<Person> people)
    { this.people = people;
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Jack"));
        people.add(new Person(++PEOPLE_COUNT, "Nikolas"));
        people.add(new Person(++PEOPLE_COUNT, "Mike"));
        people.add(new Person(++PEOPLE_COUNT, "Marry"));
    }
        public List<Person> index(){
        return people;
    }
         public Person show (int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
        public void save (Person person){
        person.setId(++PEOPLE_COUNT);
        people.add(person);
        }
        public void update(int id, Person updatePerson){
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(updatePerson.getName());
        }
        public void delete(int id){
        people.removeIf(p -> p.getId() == id);
        }
}
