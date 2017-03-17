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

}
