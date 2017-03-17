import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class EventTest {
  @Test
  public void Event_instantiatesCorrectly_true(){
    Event testEvent = new Event();
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void getFood_instantiatesCorrectly_true(){
    Event testEvent = new Event();
    testEvent.setFood("test");
    assertEquals(true, testEvent.getFood() instanceof String);
  }

  @Test
  public void getNumGuests_instantiatesCorrectly_true(){
    Event testEvent = new Event();
    testEvent.setNumGuests(4);
    assertEquals(true, testEvent.getNumGuests() instanceof Integer);
  }

  @Test
  public void getBeverage_instantiatesCorrectly_true(){
    Event testEvent = new Event();
    testEvent.setBeverage("test");
    assertEquals(true, testEvent.getBeverage() instanceof String);
  }

  @Test
  public void getEntertainment_instantiatesCorrectly_true(){
    Event testEvent = new Event();
    testEvent.setEntertainment("test");
    assertEquals(true, testEvent.getEntertainment() instanceof String);
  }

  @Test
  public void isValidFood_determinesValidInput_true(){
    Event testEvent = new Event();
    testEvent.setFood("buffet-Vegetarian");
    assertEquals(true, testEvent.isValidFood());
    testEvent.setFood("filet mignon");
    assertEquals(false, testEvent.isValidFood());
  }

  @Test
  public void calculateFoodPrice_calculatesCorrectPrice_double(){
    Event testEvent = new Event();
    testEvent.setFood("buffet-Vegetarian");
    testEvent.setNumGuests(10);
    assertEquals((double)120, testEvent.calculateFoodPrice(),0.0001);
  }

  @Test
  public void isValidBeverage_determinesValidInput_true(){
    Event testEvent = new Event();
    testEvent.setBeverage("Open Bar");
    assertEquals(true, testEvent.isValidBeverage());
    testEvent.setBeverage("sooo much pinot");
    assertEquals(false, testEvent.isValidBeverage());
  }

  @Test
  public void calculateBeveragePrice_calculatesCorrectPrice_double(){
    Event testEvent = new Event();
    testEvent.setBeverage("Open Bar");
    testEvent.setNumGuests(10);
    assertEquals((double)400, testEvent.calculateBeveragePrice(),0.0001);
    testEvent.setBeverage("Pay Bar");
    assertEquals((double)150, testEvent.calculateBeveragePrice(),0.0001);
  }

  @Test
  public void isValidEntertainment_determinesValidInput_true(){
    Event testEvent = new Event();
    testEvent.setEntertainment("DJ");
    assertEquals(true, testEvent.isValidEntertainment());
    testEvent.setEntertainment("CLOWNS");
    assertEquals(false, testEvent.isValidEntertainment());
  }

  @Test
  public void calculateEntertainmentPrice_calculatesCorrectPrice_double(){
    Event testEvent = new Event();
    testEvent.setEntertainment("Live Band");
    assertEquals((double)900, testEvent.calculateEntertainmentPrice(),0.0001);
  }

  @Test
  public void calculateTotalEventPrice_calculatesCorrectPrice_double(){
    Event testEvent = new Event();
    testEvent.setNumGuests(70);
    testEvent.setFood("buffet-Meat");
    testEvent.setBeverage("Non-alcoholic");
    testEvent.setEntertainment("Live Band");
    assertEquals((double)3800, testEvent.calculateTotalEventPrice(), 0.0001);
  }

  @Test
  public void getPotentialCoupons_instantiatesCorrectly_true(){
    Event testEvent = new Event();
    // System.out.println("TestEvent's coupons are a(n) " +testEvent.getPotentialCoupons().getClass());
    assertEquals(true, testEvent.getPotentialCoupons() instanceof ArrayList);
  }

  @Test
  public void initializeCoupons_addsCouponCodesCorrectly_true(){
    Event testEvent = new Event();
    List<String> expectedCoupons = new ArrayList<String>();
    assertEquals(expectedCoupons, testEvent.getPotentialCoupons());
    expectedCoupons.add("WINTERWEDDING2017");
    expectedCoupons.add("BESTIESWITHEVENTPLANNER2017");
    expectedCoupons.add("BRIDEZILLA2017");
    testEvent.initializeCoupons();
    assertEquals(expectedCoupons, testEvent.getPotentialCoupons());
  }

}
