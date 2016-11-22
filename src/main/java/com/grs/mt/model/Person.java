package com.grs.mt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by dwsmithson on 11/21/16.
 */
@Entity
public class Person {

    @OneToMany(mappedBy = "person")
    private Set<Task> tasks = new HashSet<>();

    @Id
    @GeneratedValue
    private long id;

    private String name;

    Person() {}

    public Person(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "Person{" +
                "tasks=" + tasks +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
