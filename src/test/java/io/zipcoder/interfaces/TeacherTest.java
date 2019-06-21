package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTest {

    @Test
    public void testImplementation() {
        Teacher kris = Educator.KRIS;

        Assert.assertTrue(kris instanceof Teacher);
    }

//    @Test
//    public void testInheritance() {
//       Educator dolio = Educator.KRIS;
//
//
//        Assert.assertTrue(dolio instanceof );
//    }

    @Test
    public void testTeach() {
        Teacher wilhem = Educator.WILHEM;
        Student learner = new Student(0L, "");
        wilhem.teach(learner, 20.0);

        Double expected = 20.0;
        Double actual = learner.getTotalStudyTime();


        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture() {
        Teacher froilan =Educator.FROILAN;
        Learner learner1 = new Student(1L, "Tommy");
        Learner learner2 = new Student(2L, "Timmy");
        Learner[] learners = {learner1, learner2};

        froilan.lecture(learners, 20.0);
        Double expected = 10.0;
        Double actual1 = learner1.getTotalStudyTime();
        Double actual2 = learner2.getTotalStudyTime();


        Assert.assertEquals(expected, actual1);
        Assert.assertEquals(expected, actual2);

    }
}