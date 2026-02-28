package com.onetoone;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passport_id") // foreign key
    private Passport passport;

    public Person() {}

    public Person(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Passport getPassport() { return passport; }
    public void setPassport(Passport passport) { this.passport = passport; }
}
