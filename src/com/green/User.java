package com.green;
import java.util.ArrayList;

public class User {
    private String firstname;
    private String lastname;
    private int age;
    private String id;
    private ArrayList<Consomation> consomations = new ArrayList<>();
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

    public static User getUser(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public void display() {
        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);
        System.out.println("Age: " + age);
        System.out.println("User ID: " + id);
    }

    public static void displayUser(String id) {
        User user = getUser(id);
        if (user != null) {
            user.display();
        } else {
            System.out.println("User not found.");
        }
    }

    public static void update(String id, String newFirstname, String newLastname, int newAge) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                user.setFirstname(newFirstname);
                user.setLastname(newLastname);
                user.setAge(newAge);
                break;
            }
        }
    }

    public static void delete(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                users.remove(user);
                System.out.println("User deleted Scfly");
                break;
            }
        }
    }
    public void addConsomation(Consomation consomation) {
        consomations.add(consomation);
    }

}
