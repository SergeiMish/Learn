package ru.MVCtest4.dao;


import org.springframework.jdbc.core.RowMapper;
import ru.MVCtest4.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();

        person.setId(resultSet.getInt("id"));
        person.setName(resultSet.getString("name"));
        person.setEmail(resultSet.getString("email"));
        person.setAge(resultSet.getInt("age"));
    }
}
