/*
 *@author Pierce Ramnarain
 */
package flights;
import java.util.ArrayList;

public class Manager {
    ArrayList<Flight> flightList = new ArrayList<>();
    Ticket[] ticketsIssued = new Ticket[100];
    int amountOfTickets = 0;
    
    public void createFlights(){
        flightList.add(new Flight(755, "Genova", "Toronto", "12/14/2020 8:00pm", 302, 134, 579.99));
        flightList.add(new Flight(756, "Genova", "Toronto", "12/15/2020 9:00pm", 302, 302, 579.99));
        flightList.add(new Flight(757, "Genova", "Toronto", "12/16/2020 10:00pm", 302, 0, 579.99)); //does not print because there are no more seats left
        flightList.add(new Flight(758, "Genova", "Toronto", "12/17/2020 11:00pm", 302, 100, 579.99));
        flightList.add(new Flight(689, "Manila", "Toronto", "01/10/2020 4:00pm", 700, 700, 999.99));
        flightList.add(new Flight(412, "Alert", "Toronto", "06/04/2020 6:00am", 50, 10, 999.99));
        flightList.add(new Flight(333, "Chicago", "Toronto", "05/31/2020 1:30pm", 400, 399, 399.99));
        flightList.add(new Flight(209, "Hong Kong", "Toronto", "01/10/2020 3:00pm", 800, 800, 999.99));
        
    }
    public void displayAvailableFlights(String origin, String destination){
        for (Flight f : this.flightList) {
            if(f == null)
                break;
            else{
                if (origin.equals(f.getOrigin()) && destination.equals(f.getDestination())) {
                    if (f.getNumberOfSeatsLeft() > 0)
                        System.out.println(f);                    
                }
            }
        }
    }
    public Flight getFlight(int flightNumber){   
        Flight n = null;
        for (Flight f : this.flightList) {
            if (flightNumber == f.flightNumber){
                n = f;
                break;
            }
        }
        return n;
    }
    public void bookSeat(int flightNumber, Passenger p){
        Flight f = getFlight(flightNumber);
        if (f != null) {
            if (p instanceof Member) {
                double newPrice = p.applyDiscount(f.getOriginalPrice());
                ticketsIssued[amountOfTickets] = new Ticket(p, f, newPrice);
                System.out.println(ticketsIssued[amountOfTickets++]);
            } 
            else if (p instanceof NonMember) {
                double newPrice = p.applyDiscount(f.getOriginalPrice());
                ticketsIssued[amountOfTickets] = new Ticket(p, f, newPrice);
                System.out.println(ticketsIssued[amountOfTickets++]);
            }
        }

    }
    public static void main(String[] args){ 
        Manager m = new Manager();
        Passenger p1 = new Member("Sushi Roll", 88, 5);
        Passenger p2 = new NonMember("Dumbo Octopus", 4);
        Passenger p3 = new Member("Bubble Tea", 30, 10);
        
        System.out.println("List of Flights:");
        m.createFlights();
        
        m.displayAvailableFlights("Genova", "Toronto");
        m.displayAvailableFlights("Manila", "Toronto");
        m.displayAvailableFlights("Alert", "Toronto");
        m.displayAvailableFlights("Chicago", "Toronto");
        m.displayAvailableFlights("Hong Kong", "Toronto");
        
        System.out.println("\nTickets:");
        m.bookSeat(755, p1);
        m.bookSeat(689, p2);
        m.bookSeat(209, p3);
    }
}
