package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetBirth() {
        // Given
        Person person = new Person();
        String expected = "June";

        // When
        person.setBirthMonth(expected);

        // Then
        String actual = person.getBirthMonth();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFavoriteColor() {
        // Given
        Person person = new Person();
        String expected = "Blue";

        // When
        person.setFavoriteColor(expected);

        // Then
        String actual = person.getFavoriteColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFavoriteNumber() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setFavoriteNumber(expected);

        // Then
        Integer actual = person.getFavoriteNumber();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetIsAlive() {
        // Given
        Person person = new Person();
        Boolean expected = true;

        // When
        person.setAlive(expected);

        // Then
        Boolean actual = person.isAlive();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetIsHungry() {
        // Given
        Person person = new Person();
        Boolean expected = false;

        // When
        person.setHungry(expected);

        // Then
        Boolean actual = person.isHungry();
        Assert.assertEquals(expected, actual);
    }
}
