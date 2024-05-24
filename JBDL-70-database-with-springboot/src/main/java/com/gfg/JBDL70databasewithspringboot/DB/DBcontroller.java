package com.gfg.JBDL70databasewithspringboot.DB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DBcontroller {
    @Autowired
    private DbService dbservice;


    @GetMapping("/getPerson")
    public List<Person> getPersonDataData(){
        return dbservice.getPersonsData();

    }
    @PostMapping("/addPerson")
    //frontend can send data to backend  by @requestbody
    public int addPerson(@RequestBody Person person){
        return dbservice.addPerson(person);
    }

}
