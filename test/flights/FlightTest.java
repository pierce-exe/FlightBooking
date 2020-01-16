/*
 *@author Pierce Ramnarain
 */
package flights;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //Test of Flight constructor, of class Flight.
    @Test
    public void testConstructor(){
        System.out.println("Constructor");
        Flight f1 = new Flight(755, "Chicago", "Toronto", "14/12/2020 9:14pm",
        502, 134, 579.99);
        assertEquals(f1.getFlightNumber(), 755);
        assertEquals(f1.getOrigin(), "Chicago");
        assertEquals(f1.getDestination(), "Toronto");
        assertEquals(f1.getDepartureTime(), "14/12/2020 9:14pm");
        assertEquals(f1.getCapacity(), 502);
        assertEquals(f1.getNumberOfSeatsLeft(), 134);
        assertEquals(f1.getOriginalPrice(), 579.99, 579.99);
    }
    
    /**
     * Test of Flight constructor, of class Flight.
     */
    @Test
    public void testInvalidConstructor(){
        System.out.println("InvalidConstructor");
        try{
        Flight f1 = new Flight(0, "", "", "", 502, 503, 579.99);
        assertEquals(f1.getFlightNumber(), 0);
        assertEquals(f1.getOrigin(), "");
        assertEquals(f1.getDestination(), "");
        assertEquals(f1.getDepartureTime(), "");
        assertEquals(f1.getCapacity(), 502);
        assertEquals(f1.getNumberOfSeatsLeft(), 134);
        assertEquals(f1.getOriginalPrice(), 579.99, 579.99);
        }
        catch(IllegalArgumentException i){
            System.out.println(i);
        }
        
    }
    
    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight instance = new Flight(755, "Chicago", "Toronto", "14/12/2020 9:14pm", 502, 0, 579.99);
        int expResult = 755;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        Flight instance = new Flight(755, "", "Toronto", "14/12/2020 9:14pm", 502, 134, 579.99);
        String expResult = "";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight instance = new Flight(0, "Chicago", "", "14/12/2020 9:14pm", 502, 134, 579.99);
        String expResult = "";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        Flight instance = new Flight(755, "Chicago", "Toronto", "14/12/2020 9:14pm", 502, 134, 579.99);
        String expResult = "14/12/2020 9:14pm";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight instance = new Flight(0, "Chicago", "Toronto", "14/12/2020 9:14pm", 502, 134, 579.99);
        int expResult = 502;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        Flight instance = new Flight(0, "Chicago", "Toronto", "14/12/2020 9:14pm", 502, 134, 579.99);
        int expResult = 134;
        int result = instance.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight instance = new Flight(0, "Chicago", "Toronto", "14/12/2020 9:14pm", 502, 134, 0.00);
        double expResult = 0.0;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight(0, "Chicago", "Toronto", "14/12/2020 9:14pm", 502, 134, 0.00);
        boolean expResult = true;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight instance = new Flight(755, "Chicago", "Toronto", "14/12/2020 9:14pm", 502, 134, 579.99);
        String expResult = "Flight 755, Chicago to Toronto, 14/12/2020 9:14pm, original price: $579.99";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
