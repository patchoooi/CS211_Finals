/**
 @author Lacanilao, Marvin Patrick D.
 @activity Individual Exercise 2 - Finals
 @classcode 9342 - CS 211 Data Structures
 -----------------------------------------------------------------------------------------------------------------
 */

import java.util.*;
import java.io.*;

/**
 * Represents a person with a name and age.
 */
public class Person implements Comparable<Person> {

    /**
     * The name of the person.
     */
    private String name;

    /**
     * The age of the person.
     */
    private int age;

    /**
     * Constructs a new Person with the specified name and age.
     *
     * @param name The name of the person.
     * @param age  The age of the person.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Gets the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name The new name of the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the person.
     *
     * @return The age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     *
     * @param age The new age of the person.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns a string representation of the person in the format "(name, age)".
     *
     * @return A string representation of the person.
     */
    @Override
    public String toString() {
        return "(" + name + "," + age + ")";
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param obj The reference object with which to compare.
     * @return True if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        return toString().equals(((Person) obj).toString());
    }

    /**
     * Compares this person to another person based on their string representations.
     *
     * @param another The person to compare to.
     * @return A negative integer, zero, or a positive integer as this person is less than, equal to, or greater than the specified person.
     */
    @Override
    public int compareTo(Person another) {
        return toString().compareTo(another.toString());
    }
}