/*
 *@author Pierce Ramnarain
 */
package flights;

public class Flight {
    int flightNumber;
    String origin;
    String destination;
    String departureTime;
    int capacity;
    int numberOfSeatsLeft;
    double originalPrice;
    
    //Initialize instance variables
    public Flight(int flightNumber, String origin, String destination, 
            String departureTime, int capacity, int numberOfSeatsLeft, 
            double originalPrice){
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.originalPrice = originalPrice;
        
        if(origin.equals(destination)){
            throw new IllegalArgumentException();
        }
        else{
            this.origin = origin;
            this.destination = destination;
        }
        
        if(numberOfSeatsLeft <= capacity && numberOfSeatsLeft > 0) {
            this.numberOfSeatsLeft = numberOfSeatsLeft;
        }
        else{
            System.out.println("Flight " + this.flightNumber + " from " 
                    + this.origin + " to " + this.destination + " is fully booked.");
        }
    }
    void setFlightNumber(int flightNumber){
        this.flightNumber = flightNumber;
    }
    int getFlightNumber(){
        return flightNumber;
    }
    
    void setOrigin(String origin){
        this.origin = origin;
    }
    String getOrigin(){
        return origin;
    }
    
    void setDestination(String destination){
        this.destination = destination;
    }
    String getDestination(){
        return destination;
    }
    
    void setDepartureTime(String departureTime){
        this.departureTime = departureTime;
    }
    String getDepartureTime(){
        return departureTime;
    }
    
    void setCapacity(int capacity){
        this.capacity = capacity;
    }
    int getCapacity(){
        return capacity;
    }
    
    void setNumberOfSeatsLeft(int numberOfSeatsLeft){
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }
    int getNumberOfSeatsLeft(){
        return numberOfSeatsLeft;
    }
    
    void setOriginalPrice(double originalPrice){
        this.originalPrice = originalPrice;
    }
    double getOriginalPrice(){
        return originalPrice;
    }
    
    boolean bookASeat(){
        if (this.getNumberOfSeatsLeft() > 0){
            numberOfSeatsLeft--;
            return true;
        }
        else
            return false;
    }
    
    @Override
    public String toString(){
        return "Flight " + this.getFlightNumber() + ", " + this.getOrigin() + " to " + this.getDestination()
                + ", " + this.getDepartureTime() + ", original price: $" + this.getOriginalPrice();
    }
}
