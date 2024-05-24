package com.gfg.JBDL70databasewithspringboot.DB;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data//for getter and setter
@AllArgsConstructor //for argument constructor
@ToString // for to string method
@Builder
public class Person {
    private String name;
    private int id;

}
