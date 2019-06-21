package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington Instance = new ZipCodeWilmington();

    private Students students = Students.getInstance();
    private Instractors instractors = Instractors.getInstance();

    public static ZipCodeWilmington getInstance() {
        return Instance;
    }

    private ZipCodeWilmington() {
    }

    public void hostLecture(Teacher teacher, Double numberOfHours) {

        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(Long Id, Double numberOfHours) {
        Teacher teacher = (Teacher) (instractors.findById(Id));

        if(teacher !=null){
            hostLecture(teacher, numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studentMap = new HashMap<>();


        for (Student student: students.toArray()) {

            studentMap.put(student, student.getTotalStudyTime());

        }

        return studentMap;
    }
}
