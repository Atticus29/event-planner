import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
  @Test
  public void Event_instantiatesCorrectly_true(){
    Event testEvent = new Event();
    assertEquals(true, testEvent instanceof Event);
  }
}
