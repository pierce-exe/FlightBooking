/*
 *@author Pierce Ramnarain
 */
package flights;

public class Member extends Passenger{
    int yearsOfMembership;

    public Member(String name, int age, int yearsOfMembership) {
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }
    
    @Override
    double applyDiscount(double p){
        if(yearsOfMembership > 5){
            p = Math.round(p*0.5);
            return p;
        }
        else if(yearsOfMembership > 1 && yearsOfMembership <= 5){
            p = Math.round(p*0.9);
            return p;
        }
        else
            return p;
    }
}
