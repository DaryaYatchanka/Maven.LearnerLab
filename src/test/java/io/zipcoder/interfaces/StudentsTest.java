package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {


    @Test
    public void testStudentClass1() {
        Students students = Students.getInstance();
       //Person[] storearray =   students.toArray();
       Person  person = students.findById(1L);

        String expected = "Dasha";
        String actual = person.getName();

        Assert.assertEquals(expected, actual);

    }


    @Test
    public void testStudentClass2(){
        Students students = Students.getInstance();
      //  Person[] storearray =   students.toArray();
        Person  person = students.findById(3L);

        String expected = "Alicia";
        String actual = person.getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testStudentClass3(){
        Students students = Students.getInstance();
       // Person[] storearray =   students.toArray();
        Person  person = students.findById(2L);

        String expected = "Robert";
        String actual = person.getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testStudentClass4(){
        Students students = Students.getInstance();
      //  Person[] storearray =   students.toArray();
        Person  person = students.findById(4L);

        String expected = "Andrew";
        String actual = person.getName();

        Assert.assertEquals(expected, actual);

    }
}