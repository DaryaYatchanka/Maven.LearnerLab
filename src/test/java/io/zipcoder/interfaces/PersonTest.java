package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void constructorTest() {
        Long expectedId = Long.MAX_VALUE;
        String expectedName = "PersonName";

        Person person = new Person(expectedId, expectedName);

        Long actualId = person.getId();
        String actualName = person.getName();

        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }



    @Test
    public void setName() {

        Person person = new Person(20L, "Robert");
        String expected = "Bill";
        person.setName("Bill");
        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }
}