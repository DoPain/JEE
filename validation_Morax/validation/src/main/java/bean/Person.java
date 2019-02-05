package bean;

import constraint.Login;

import java.util.ArrayList;

public class Person {

    private String email;
    private String firstName;
    private String lastName;
    private String login;
    private boolean isStudent;
    @Login

    private ArrayList<Person> teachers;
    private ArrayList<Person> students;
    private ArrayList<Person> customers;

    private Person creator;
    private Person lastModifier;

    public Person(){}

    public Person(String email,
                  String firstName,
                  String lastName,
                  String login,
                  boolean isStudent) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.isStudent = isStudent;
    }


    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public ArrayList<Person> getTeachers() {
        return teachers;
    }

    public ArrayList<Person> getStudents() {
        return students;
    }

    public ArrayList<Person> getCustomers() {
        return customers;
    }

    public void setTeachers(ArrayList<Person> teachers) {
        this.teachers = teachers;
    }

    public void setStudents(ArrayList<Person> students) {
        this.students = students;
    }

    public void setCustomers(ArrayList<Person> customers) {
        this.customers = customers;
    }

    public Person getCreator() {
        return creator;
    }

    public Person getLastModifier() {
        return lastModifier;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public void setLastModifier(Person lastModifier) {
        this.lastModifier = lastModifier;
    }
}
