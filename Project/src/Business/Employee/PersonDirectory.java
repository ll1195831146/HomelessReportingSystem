/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author liulei
 */
public class PersonDirectory {
    private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public Person addPerson(){
        Person person = new Person();
        personList.add(person);
        return person;
    }
         public void deletePerson(Person person){
        personList.remove(person);
    }
        
            public Person createPerson(String name){
        Person p  = new Person();
        p.setName(name);
        personList.add(p);
        return p;
    }
}
