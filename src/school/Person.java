
package school;
import java.util.ArrayList;
public class Person {

//        public static int numPeople = 10;
//        private static int currentPeopleIndex=0;
//        private static Person people[]= new Person [numPeople];
        private static ArrayList<Person> people =
        new ArrayList<Person>();
        
         enum Gender{
        Male,Female
    }
    
    private Gender gender;
    private String name;
    private int weight;
    
    public static Person addPerson(String _name, Gender _gender, int _weight)
    {
        Person temp =  new Person(_name,_gender,_weight);
       // people[currentPeopleIndex++] = temp;
        people.add(temp);
        return (temp);
    }
    
    
    
    Person()
    {
       name = "Churro";
       weight = 150;
       gender = Gender.Female;
    }    
    Person(String _name, Gender _gender, int _weight)
    {        
             name = _name;
             weight = _weight;
             gender=  _gender;
    }    
    
    public void setGender(Gender _gender)
    {
        gender = _gender;
    }
      public Gender getGender()
    {
        return(gender);
    }
      public void setweight(int _weight)
    {
        weight = _weight;
    }
      public int getweight()
    {
        return(weight);
    }
      public void setname(String _name)        
    {
        name = _name;
    }
      public String getname()
    {
        return(name);
    }
  
      
      public static void printName()
      {
          System.out.println("===printName===");
          
//          for(int index =0; index<people.length;index++)
//          {
//              if(people[index] != null)
//                  System.out.println(people[index].getname());
//          }
//           for(int index =0; index<people.size();index++)
//         {
//                 System.out.println(people.get(index).getname());
//         }
//          
          
          for(Person temp: people)
          {
              System.out.println(temp.getname());
          }
          
      }
        public static void printName(Gender _gender)
      {
          System.out.println("===printName===");
           for(Person temp: people)
          {
              if(temp.gender == _gender)
              System.out.println(temp.getname());
          }
      }
    
        
        
        public String toString()
      {
          return(name + ""+ gender+ "" + weight);
      }

}

