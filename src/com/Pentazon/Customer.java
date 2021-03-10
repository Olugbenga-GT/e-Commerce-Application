package com.Pentazon;

import java.util.List;


/**
 * Class to depict users of the pentazon System
 * @@author Olugbenga_GT
 */

public abstract class Customer {
    private Integer id;
    private String firstName;
    private String surName;

    private List<Address> addresses;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
