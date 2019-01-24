package com.example.recyclerviewwithcustomobjects;

public class Person {

    //properties of a person
    private String firstName;
    private String lastName;
    private int age;
    private String favoriteColor;

    //setting the properties upon creation of a person
    public Person(String firstName, String lastName, int age, String favoriteColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.favoriteColor = favoriteColor;
    }

    //getting the properties
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }
}
