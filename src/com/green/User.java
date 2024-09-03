package com.green;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;


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
        int total = 0;
        for (Consomation consomation : consomations) {
            total += consomation.getValue();
        }
        System.out.println("Total Consumation: " + total);
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

    public void generateReport() {
        double daily = 0;
        double weekly = 0;
        double monthly = 0;

        for (Consomation consomation : consomations) {
            long days = ChronoUnit.DAYS.between(consomation.getStartdate(), consomation.getEnddate()) + 1;
            double dailyValue = (double) consomation.getValue() / days;
            daily += dailyValue;
            weekly += dailyValue * 7;
            monthly += dailyValue * 30;
        }

        System.out.println("Consumption Report for User ID: " + id);
        System.out.println("Daily: %.2f" + daily);
        System.out.println("Weekly: %.2f" + weekly);
        System.out.println("Monthly: %.2f" + monthly);
    }

}
