import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Event{

  private String mFood;
  private Integer mNumGuests;
  private String mBeverage;
  private String mEntertainment;

  public Event(){


  }

  public String getFood(){
    // String returnVal = "test";
    return mFood;
  }
  public void setFood(String usrFood){
    mFood = usrFood;
  }
  public Integer getNumGuests(){
    // Integer returnVal = 3;
    return mNumGuests;
  }
  public void setNumGuests(int usrNumGuests){
    mNumGuests = usrNumGuests;
  }
  public String getBeverage(){
    // String returnVal = "test";
    return mBeverage;
  }
  public void setBeverage(String usrBeverage){
    mBeverage = usrBeverage;
  }
  public String getEntertainment(){
    // String returnVal = "test";
    return mEntertainment;
  }
  public void setEntertainment(String usrEntertainment){
    mEntertainment = usrEntertainment;
  }


}
