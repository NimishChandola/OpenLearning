package org.BlueprintAI.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Components {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void CreateTable()
    {
        var query = "create Table Components(id SERIAL PRIMARY KEY, name varchar(255) NOT NULL)";
        int update = this.jdbcTemplate.update(query);
        System.out.println(update);
    }
}
