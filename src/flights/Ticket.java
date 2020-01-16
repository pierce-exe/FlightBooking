/*
 *@author Pierce Ramnarain
 */
package flights;

public class Ticket {
    Passenger p1;
    Flight f1;
    double price;
    static int number = 0;
    
    public Ticket(Passenger p, Flight flight, double price){
        p1 = p;
        f1 = flight;
        this.price = price;
        number++;
    }
    
    Passenger getPassenger(){
        return p1;
    }
    Flight getFlight(){
        return f1;
    }
    
    void setPrice(double price){
        this.price = price;
    }
    double getPrice(){
        return price;
    }
    
    @Override
    public String toString(){
        return this.p1.name + ", " + this.getFlight() + ", new ticket price: $" + this.getPrice();
    }
}
