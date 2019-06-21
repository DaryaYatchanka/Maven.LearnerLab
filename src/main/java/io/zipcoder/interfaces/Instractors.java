package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Instractors extends People<Instructor>{
    private static final Instractors Instance = new Instractors();

    public static Instractors getInstance() {

        return Instance;
    }

    @Override
    public Instructor[] toArray() {
       List<Instructor> instractorList = new ArrayList<>();
       Iterator itr = iterator();

       while(itr.hasNext()){
           Instructor instructor= (Instructor)itr.next();
           instractorList.add(instructor);
       }
       return instractorList.toArray(new Instructor[instractorList.size()]);
    }

    private Instractors() {
//        super.add(new Instructor(5L, "Kris"));
//        super.add(new Instructor(6L, "Dolio"));
//        super.add(new Instructor(7L, "Froilan"));
//        super.add(new Instructor(8L, "Wilhem"));
      for(Educator educator:Educator.class.getEnumConstants()){
          super.add(educator.getInstructor());
      }

    }
}
