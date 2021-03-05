package Project;
import java.io.*;
/**
 * @author Gabriel Mawunyo Owusu
 *
 */

public class Person{

    //Instance Variables
    String name; // name instance variable
    String gender; // gender "Male" "Female"
    int age; // age instance variable

   /**
     * @brief: Default Constructor to Initialize class
     * @param void
     * @return void
     */
    public Person(){
        this.name = "No name yet";
        this.gender = "N/A";
        this.age = 0;
    }

     /**
     * @brief: Second Constructor that specifies instance variables of class
     * @param name String
     * @param gender String
     * @param age int
     */
    public Person(String name, String gender, int age){
        this.name = name;
        this.gender= gender;
        this.age = age;
    }

    /**
     * @brief: Accessor method for name instance variable 
     * @return name
     */
    public String getName() { 
        return this.name; 
    }

    /**
     * @brief: Accessor method for gender instance variable 
     * @return gender
     */
    public String getGender() { 
        return this.gender; 
    }

        /**
     * @brief: Accessor method for age instance variable 
     * @return age
     */
    public int getAge() { 
        return this.age; 
    }

    /**
     * @brief: Mutator method to set name instance variable
     * @param name
     */
    public void setName(String name) { 
        this.name = name; 
    }

    /**
     * @brief: Mutator method to set gender instance variable
     * @param gender
     */
    public void setGender(String gender) { 
        this.gender = gender; 
    }

    /**
     * @brief: Mutator method to set age instance variable
     * @param age
     */
    public void setAge(int age) { 
        this.age = age; 
    }

    /**
   * toString method:
   * @override the toString method in the Object Class
   * 
   */
    @Override
    public String toString() {
	  return this.getName()+", "+this.getGender()+", "+this.getAge();
    }

    public static void main(String [] args){
        //Creating a new person
        Person person1 = new Person("Gabriel","Male",19);

        System.out.println("\nPerson 1: "+person1.toString()); 
    }
}