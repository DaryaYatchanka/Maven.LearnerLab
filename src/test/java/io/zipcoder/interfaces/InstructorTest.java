package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(0L, "");

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(0L, "");

        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(0L, "");
        Student learner = new Student(0L, "");
        instructor.teach(learner, 20.0);

        Double expected = 20.0;
        Double actual = learner.getTotalStudyTime();


        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(0L, "");
        Learner learner1 = new Student(1L, "Tommy");
        Learner learner2 = new Student(2L, "Timmy");
        Learner[] learners = {learner1, learner2};

        instructor.lecture(learners, 20.0);
        Double expected = 10.0;
        Double actual1 = learner1.getTotalStudyTime();
        Double actual2 = learner2.getTotalStudyTime();


        Assert.assertEquals(expected, actual1);
        Assert.assertEquals(expected, actual2);

    }
}