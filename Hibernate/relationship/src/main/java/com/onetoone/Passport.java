package com.onetoone;

import javax.persistence.*;

@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String passportNumber;

    @OneToOne(mappedBy = "passport")
    private Person person;

    public Passport() {}
    public Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getPassportNumber() { return passportNumber; }
    public void setPassportNumber(String passportNumber) { this.passportNumber = passportNumber; }
    public Person getPerson() { return person; }
    public void setPerson(Person person) { this.person = person; }
}
