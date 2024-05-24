package com.gfg.JBDL70databasewithspringboot.DB;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Configuration
public class GetConnection {

    //make bean of connection class
    //if i want to make a bean of pre defined class ,in that case i use an
    //annotation @Bean and @Configuration

    @Bean  //singleton bean
    public Connection connection() {
        try{
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jbdl-70","root","jeet@1234");
            return connection;
        }
        catch(SQLException e){
            throw new RuntimeException(e.getMessage());
        }

    }
}
