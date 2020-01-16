/*
 *@author Pierce Ramnarain
 */
package flights;

public class NonMember extends Passenger{
    
    public NonMember(String name, int age){
        super(name, age);
    }
    
    @Override
    double applyDiscount(double p){
        if(age > 65){
            p = p*0.9;
            return p;
        }
        else
            return p;
    }
}
