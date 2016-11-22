package com.grs.mt.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by dwsmithson on 11/13/16.
 */
@Entity
public class Task {

    @JsonIgnore
    @ManyToOne
    private Person person;

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private Task() {}

    public Task(String name) {
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

    @Override
    public String toString() {
        return "Task{" +
                "person=" + person +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
