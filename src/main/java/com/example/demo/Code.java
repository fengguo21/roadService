package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Code {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String code;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return code;
    }

    public void setName(String name) {
        this.code = name;
    }


}