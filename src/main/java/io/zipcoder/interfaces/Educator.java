package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    KRIS(5L), DOLIO(6L), WILHEM(8L), FROILAN(7L);

    private final Instructor instructor;
    private Double timeWorked;

    private Educator(Long id){
        instructor = new Instructor(id, toString());
        timeWorked = 0D;

    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
       instructor.teach(learner, numberOfHours);
       timeWorked+=numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {
      instructor.lecture(learners, numberOfHours);
      timeWorked+=numberOfHours;
    }
    public Double getTimeWorked(){
        return timeWorked;
    }

    public Instructor getInstructor(){
        return instructor;
    }
}
