/*
 *@author Pierce Ramnarain
 */
package flights;

public abstract class Passenger {
    String name;
    int age;
    
    public Passenger(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
    
    abstract double applyDiscount(double p);
}
