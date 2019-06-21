package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Students extends People<Student>{

    private static final Students INSTANCE = new Students();


    @Override
    public Student[] toArray() {

        List<Student> studentList = new ArrayList<>();
        Iterator itr = iterator();

        while(itr.hasNext()){
            Student student = (Student)itr.next();
            studentList.add(student);
        }
        return studentList.toArray(new Student[studentList.size()]);
    }

    private Students() {
       super.add(new Student(1L, "Dasha"));
        super.add(new Student(2L,"Robert"));
        super.add(new Student(3L, "Alicia"));
        super.add(new Student(4L, "Andrew"));
    }

    public static Students getInstance(){
        return INSTANCE;
    }
}

