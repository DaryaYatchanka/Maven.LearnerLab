package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    private Double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
        this.totalStudyTime=0D;
    }

    public void learn(double numberOfHours) {

        totalStudyTime= totalStudyTime+numberOfHours;

    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
