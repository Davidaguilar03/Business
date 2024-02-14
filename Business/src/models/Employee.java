package models;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private char gender;

    public Employee(int id, String name, String lastName, char gender) {
        this.id = id;
        this.firstName = name;
        this.lastName = lastName;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}