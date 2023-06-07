package ru.MVCtest4.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.MVCtest4.models.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {

    private final JdbcTemplate jdbcTemplate;
@Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> index() {
    return jdbcTemplate.query("SELECT * FROM Person",new BeanPropertyRowMapper<>(Person.class ));
    }
    public Person show(int id) {
    return jdbcTemplate.query("SELECT * FROM Person WHERE id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Person.class))
            .stream().findAny().orElse(null);
    }
    public void save(Person person) {
       jdbcTemplate.update("INSERT INTO Person VALUES(1, ?, ?, ?)", )
    }
    public void update(int id, Person updatedPerson) {
        try { PreparedStatement preparedStatement =
                connection.prepareStatement("UPDATE Person SET name=?, age=?, email=? WHERE id=?");

            preparedStatement.setString(1, updatedPerson.getName());
            preparedStatement.setInt(2, updatedPerson.getAge());
            preparedStatement.setString(3, updatedPerson.getEmail());
            preparedStatement.setInt(4, id);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void delete(int id) {
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("DELETE FROM Person WHERE id=?");
                preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
