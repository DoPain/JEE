package fr.iut;

import fr.iut.constraints.IsMajor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by fred on 10/02/15.
 */
public class Person {

    @NotNull
    private String name;

    private String surname;

    @IsMajor
    private int age;

    @Size(max = 2000)
    private String currentJob;

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public String getCurrentJob() {
        return currentJob;
    }

    public void setCurrentJob(final String currentJob) {
        this.currentJob = currentJob;
    }
}
