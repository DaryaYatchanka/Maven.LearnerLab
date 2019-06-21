package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testImplementation() {
        Student student = new Student(2L, "Bobby");

        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
       Student student = new Student(0L, "");

       Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        Student student = new Student(0L, "");

        student.learn(20);
        Double expected=20D;
        Double actual = student.getTotalStudyTime();

                Assert.assertEquals(expected, actual);
    }
}