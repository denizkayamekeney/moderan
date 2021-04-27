package com.moderant.assignment.dto;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name="person")
public class Person {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @NonNull
    @Column(name="name")
    private String name;


    public Person() {

    }
    public Person(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
