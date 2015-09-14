/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author 373000995
 */
public class School {

    public static void main(String[] args) {
        Person jill = Person.addPerson("Sally",Person.Gender.Female,200);
        jill.setname("Sarah");
        Person joe = Person.addPerson("Joe",Person.Gender.Male,120);
        System.out.println(joe.getweight());
        Person.printName();
        
       Person.printName(Person.Gender.Male);
        
        System.out.println(jill);
        System.out.println(joe);
        
    }
}
