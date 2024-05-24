package com.gfg.JBDL70databasewithspringboot.DB;

import java.util.List;

public interface DBrepo {
     List<Person> getPersonsData();
     int addPerson(Person person);
}
