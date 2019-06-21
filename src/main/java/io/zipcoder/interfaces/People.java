package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <E extends Person> implements Iterable<E>{
    private List<E> personList = new ArrayList<>();

    public void add(E person) {

        personList.add(person);
    }

    public Person findById(Long Id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId().equals(Id)) {
                return personList.get(i);
            }

        }

        return null;
    }

    public Boolean contains(E person) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).equals(person)) {
                return true;
            }
        }
        return false;
    }

    public void remove(E person){
        personList.remove(person);

    }
  //might be problem with the size().  if it is, loop in opposite direction.
    public void remove(Long Id){
        for (int i = 0; i <personList.size(); i++) {
           if(personList.get(i).getId().equals(Id)){
               personList.remove(personList.get(i));
           }

        }
    }

    public void removeAll(){
        personList.clear();
    }

    public Integer count(){
        return personList.size();
    }

   abstract public E[] toArray();



    @Override
    public Iterator<E> iterator() {

        return personList.iterator();
    }
}
