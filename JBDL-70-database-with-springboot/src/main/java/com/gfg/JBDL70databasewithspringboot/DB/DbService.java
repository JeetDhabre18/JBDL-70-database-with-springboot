package com.gfg.JBDL70databasewithspringboot.DB;
//for business logic

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {
    @Autowired
    private DBrepo dBrepo ;
    public List<Person> getPersonsData() {
        //business logic

        //data from db
        return dBrepo.getPersonsData();

    }

    public int addPerson(Person person) {
        return dBrepo.addPerson(person);
    }
}
