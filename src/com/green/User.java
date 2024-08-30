package com.green;

import java.util.ArrayList;
public class User {
    private String firstname;
    private String lastname;
    private int age;
    private String id;
    private static ArrayList<User> users = new ArrayList<>();

    public User(String firstname, String lastname, int age, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void createUser(String firstname, String lastname, int age, String id) {
        users.add(new User(firstname, lastname, age, id));
    }

}
