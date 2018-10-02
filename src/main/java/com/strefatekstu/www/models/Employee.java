package com.strefatekstu.www.models;

public class Employee {
    private String firstname;
    private String lastname;
    private String hiredate;

    public Employee(String firstname, String lastname, String hiredate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.hiredate = hiredate;
    }

    public Employee() {
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

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }
}
