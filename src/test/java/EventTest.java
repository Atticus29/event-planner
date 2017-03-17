import org.junit.*;
import static org.junit.Assert.*;

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
  public void calculateBeveragePrice_calculatesCorrectPrice_double(){
    Event testEvent = new Event();
    testEvent.setBeverage("Open Bar");
    testEvent.setNumGuests(10);
    assertEquals((double)400, testEvent.calculateBeveragePrice(),0.0001);
    testEvent.setBeverage("Pay Bar");
    assertEquals((double)150, testEvent.calculateBeveragePrice(),0.0001);
  }

}
