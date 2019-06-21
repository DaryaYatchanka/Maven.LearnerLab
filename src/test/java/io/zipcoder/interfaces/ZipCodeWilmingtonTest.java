package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {
 ZipCodeWilmington zcw =ZipCodeWilmington.getInstance();

    @Test
    public void testHostLecture() {
        Teacher teacher1 = new Instructor(10L, "Tariq");
        Double expected = 10.0;

        zcw.hostLecture(teacher1, 40.0);
        Map<Student, Double> studentMap = zcw.getStudyMap();
        for(Map.Entry<Student, Double> entry :studentMap.entrySet()){
            Assert.assertEquals(expected, entry.getValue());
        }
    }
}