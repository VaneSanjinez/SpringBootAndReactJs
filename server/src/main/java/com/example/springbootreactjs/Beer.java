package com.example.springbootreactjs;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Beer {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    public Beer() { }
    public Beer(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "Beer{" +
                "id=" + id +
                ", name=" + name + "\'" +
                '}';

    }
}
