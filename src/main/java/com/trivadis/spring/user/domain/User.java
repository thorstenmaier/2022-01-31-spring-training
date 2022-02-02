package com.trivadis.spring.user.domain;

// INSERT INTO user (firstname) values ('Thorsten')

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String firstname;

    @Column(unique = true)
    private String lastname;

    @OneToOne
    private Address address;

    public User() {
    }

    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
