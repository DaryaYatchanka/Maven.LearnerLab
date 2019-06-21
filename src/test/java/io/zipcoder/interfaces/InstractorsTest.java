package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstractorsTest {

    @Test
    public void getInstanceTest1() {
       Instractors instractors = Instractors.getInstance();
       Person person = instractors.findById(5L);

       String expected = "KRIS";
       String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getInstanceTest2(){
        Instractors instractors = Instractors.getInstance();
        Person person = instractors.findById(6L);

        String expected = "DOLIO";
        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getInstanceTest3(){
        Instractors instractors= Instractors.getInstance();
        Person person = instractors.findById(7L);

        String expected = "FROILAN";
        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getInstanceTest4() {
        Instractors instractors = Instractors.getInstance();
        Person person = instractors.findById(8L);

        String expected = "WILHEM";
        String actual = person.getName();

        Assert.assertEquals(expected,actual);
    }
}