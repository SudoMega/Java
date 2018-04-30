import java.util.ArrayList;

/**
 * The test class TrainTest.
 *
 * @author  Lynn Marshall
 * @version May 2015
 */
public class TrainTest extends junit.framework.TestCase
{
    /* Empty train object */
    Train aTrain;
    
    /* Four car objects */
    Car car1;
    Car car2;
    Car car3;
    Car car4;
    
    /**
     * Default constructor for test class TrainTest
     */
    public TrainTest()
    {
        aTrain = new Train();
        
        car1 = new Car(1250, true);
        car2 = new Car(1300, false);
        car3 = new Car(1740, false);
        car4 = new Car(2000, true);
        
        aTrain.addCar(car1);
        aTrain.addCar(car2);
        aTrain.addCar(car3);
        aTrain.addCar(car4);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }
 
    /**
     * Creates and empty train. Tests if it is empty.
     */
    public void testCreateEmptyTrain()
    {
        Train emptyTrain = new Train();
        
        /* Verify that a new train has no cars. */
        assertEquals(0, emptyTrain.cars().size());
    }
    
    /**
     * Checks if the cars added to the train are the same as the individual
     * car objects created in the constructor.
     */
    public void testAddCar()
    {
        ArrayList<Car> cars = aTrain.cars();
        assertEquals(4, cars.size());
         
        /* Important - assertSame() does not compare the Car objects 
         * referred to by car1 and aCar to detemine if they are equal
         * (have the same state). It verifies that car1 an aCar refer to
         * the same object; i.e., that the Car (reference) retrieved by get(0)
         * is the first first that was added to the ArrayList.
         */
        assertSame(car1, cars.get(0));
        
        assertSame(car2, cars.get(1));
       
        assertSame(car3, cars.get(2));   
        
        assertSame(car4, cars.get(3));
    }
        
    /**
     * Books seats and checks if the data is stored.
     */
    public void testIssueTicket()
    {       
        /* Book all the seats in the business-class car. */
        for (int i = 0; i < 2*(Car.BUSINESS_SEATS); i++) {
            assertTrue(aTrain.issueTicket(true));
        }
        
        /* Attempt to book one more business-class seat, even
         * though they are all booked.
         */
        assertFalse(aTrain.issueTicket(true));        
 
        ArrayList<Car> cars = aTrain.cars();
        
        for (int i = 0; i < Car.BUSINESS_SEATS; i++) {
            assertTrue(cars.get(0).seats()[i].isBooked());
        }
        
        for (int i = 0; i < Car.ECONOMY_SEATS; i++) {
            assertFalse(cars.get(1).seats()[i].isBooked());
        }
        
        for (int i = 0; i < Car.ECONOMY_SEATS; i++) {
            assertFalse(cars.get(2).seats()[i].isBooked());
        }
        
        for (int i = 0; i < Car.BUSINESS_SEATS; i++) {
            assertTrue(cars.get(3).seats()[i].isBooked());
        }
        
        /* Book all the seats in the first economy-class car. */
        for (int i = 0; i <Car.ECONOMY_SEATS; i++) {
            assertTrue(aTrain.issueTicket(false));
        }
        
        cars = aTrain.cars();
        
        for (int i = 0; i < Car.BUSINESS_SEATS; i++) {
            assertTrue(cars.get(0).seats()[i].isBooked());
        }
        
        for (int i = 0; i < Car.ECONOMY_SEATS; i++) {
            assertTrue(cars.get(1).seats()[i].isBooked());
        }
        
        for (int i = 0; i < Car.ECONOMY_SEATS; i++) {
            assertFalse(cars.get(2).seats()[i].isBooked());
        }  
        
        /* Book all the seats in the second economy-class car. */
        for (int i = 0; i <Car.ECONOMY_SEATS; i++) {
            assertTrue(aTrain.issueTicket(false));
        }
        
        /* check that all seats are now booked */
        for (int i = 0; i < Car.BUSINESS_SEATS; i++) {
            assertTrue(cars.get(0).seats()[i].isBooked());
        }
        
        for (int i = 0; i < Car.ECONOMY_SEATS; i++) {
            assertTrue(cars.get(1).seats()[i].isBooked());
        }
        
        for (int i = 0; i < Car.ECONOMY_SEATS; i++) {
            assertTrue(cars.get(2).seats()[i].isBooked());
        }  
        
        for (int i = 0; i < Car.BUSINESS_SEATS; i++) {
            assertTrue(cars.get(3).seats()[i].isBooked());
        }
        
        /* Try to book another business class seat (fails)*/
        assertFalse(aTrain.issueTicket(true));
        /* Try to book another economy class seat (fails)*/
        assertFalse(aTrain.issueTicket(false));
    }
    
    /**
     * Books tickets and cancels them. Checks if the cancellation is stored.
     */
    public void testCancelTicket()
    {
        /* Book all the seats in the business-class car. */
        for (int i = 0; i < (Car.BUSINESS_SEATS + Car.BUSINESS_SEATS/2); i++) {
            assertTrue(aTrain.issueTicket(true));
        }
        
        /* Book all the seats in the first economy-class car. */
        for (int i = 0; i <Car.ECONOMY_SEATS; i++) {
            assertTrue(aTrain.issueTicket(false));
        }
        
        ArrayList<Car> cars = aTrain.cars();
        
        assertTrue(aTrain.cancelTicket(1300, 4));
        assertFalse(cars.get(1).seats()[3].isBooked());        
        
        /* Cancel ticket in a non-existent car. */
        assertFalse(aTrain.cancelTicket(1500, 7));
        
        /* Cancel ticket in a non-existent seat. */
        assertFalse(aTrain.cancelTicket(1300, 54));
        
        /* Cancel ticket for a seat that hasn't been booked. */
        assertFalse(aTrain.cancelTicket(1740, 21));
        assertFalse(cars.get(2).seats()[20].isBooked());        
        
        /* Attempt to cancel the same ticket twice. */
        assertTrue(aTrain.cancelTicket(1250, 11));
        assertFalse(cars.get(0).seats()[10].isBooked());
        
        assertFalse(aTrain.cancelTicket(1250, 11));   
        assertFalse(cars.get(0).seats()[10].isBooked());
        
        /* Cancel one of the front half of the second business car */
        assertTrue(aTrain.cancelTicket(2000, 3));
        assertFalse(cars.get(3).seats()[2].isBooked());
        
        /* Attempt to cancel one in the back of the second business car */
        assertFalse(aTrain.cancelTicket(2000, 25));
        assertFalse(cars.get(3).seats()[24].isBooked());
    }
    
    /**
     * Books, cancels and books tickets again to see if everything works.
     */
    public void testBookCancelTicket()
    {  
        ArrayList<Car> cars = aTrain.cars();
        
        /* Book all the seats in the business-class car. */
        for (int i = 0; i < (Car.BUSINESS_SEATS + Car.BUSINESS_SEATS/2); i++) {
            assertTrue(aTrain.issueTicket(true));
        }
        
        /* Book all the seats in the first economy-class car. */
        for (int i = 0; i <Car.ECONOMY_SEATS; i++) {
            assertTrue(aTrain.issueTicket(false));
        }
        
        /* Cancel 3 random tickets from the first economy car*/
        assertTrue(aTrain.cancelTicket(1300, 1));
        assertTrue(aTrain.cancelTicket(1300, 2));
        assertTrue(aTrain.cancelTicket(1300, 3));
        
        /* Book 4 tickets */
        assertFalse(cars.get(1).seats()[0].isBooked());
        assertTrue(aTrain.issueTicket(false));
        assertTrue(cars.get(1).seats()[0].isBooked());
        
        assertFalse(cars.get(1).seats()[1].isBooked());
        assertTrue(aTrain.issueTicket(false));
        assertTrue(cars.get(1).seats()[1].isBooked());
        
        assertFalse(cars.get(1).seats()[2].isBooked());
        assertTrue(aTrain.issueTicket(false));
        assertTrue(cars.get(1).seats()[2].isBooked());
        
        assertFalse(cars.get(2).seats()[0].isBooked());
        assertTrue(aTrain.issueTicket(false));
        assertTrue(cars.get(2).seats()[0].isBooked());
        
        /* Cancel three business car seats */
        assertTrue(aTrain.cancelTicket(1250, 2));
        assertTrue(aTrain.cancelTicket(2000, 1));
        assertTrue(aTrain.cancelTicket(2000, 2));
        
        /* Book 4 business car seats */
        assertFalse(cars.get(0).seats()[1].isBooked());
        assertTrue(aTrain.issueTicket(true));
        assertTrue(cars.get(0).seats()[1].isBooked());
        
        assertFalse(cars.get(3).seats()[0].isBooked());
        assertTrue(aTrain.issueTicket(true));
        assertTrue(cars.get(3).seats()[0].isBooked());
        
        assertFalse(cars.get(3).seats()[1].isBooked());
        assertTrue(aTrain.issueTicket(true));
        assertTrue(cars.get(3).seats()[1].isBooked());
        
        assertFalse(cars.get(3).seats()[15].isBooked());
        assertTrue(aTrain.issueTicket(true));
        assertTrue(cars.get(3).seats()[15].isBooked());
    }
}
