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
  public boolean isValidFood(){
    String[] validFood = {"buffet-Vegetarian", "buffet-Meat", "plated-Meat", "plated-Vegetarian", "plated-Fish"};
     return Arrays.asList(validFood).contains(mFood);
  }
  public double calculateFoodPrice(){
      String[] validFood = {"buffet-Vegetarian", "buffet-Meat", "plated-Meat", "plated-Vegetarian", "plated-Fish"};
      Integer[] foodPrices = {12, 15, 25, 18, 26};
      int foodArrayIndex = Arrays.asList(validFood).indexOf(mFood);
      double pricePerGuest = foodPrices[foodArrayIndex];
      double totalFoodPrice = pricePerGuest * mNumGuests;
      return totalFoodPrice;
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
  public boolean isValidBeverage(){
    String[] validBeverage = {"Open Bar", "Pay Bar", "Non-alcoholic"};
     return Arrays.asList(validBeverage).contains(mBeverage);
  }
  public double calculateBeveragePrice(){
      String[] validBeverage = {"Open Bar", "Pay Bar", "Non-alcoholic"};
      Integer[] beveragePrices = {40, 150, 100};
      int beverageArrayIndex = Arrays.asList(validBeverage).indexOf(mBeverage);
      if (beverageArrayIndex == 0){
        double pricePerGuest = beveragePrices[beverageArrayIndex];
        double totalBeveragePrice = pricePerGuest * mNumGuests;
        return totalBeveragePrice;
      } else {
        double totalBeveragePrice = beveragePrices[beverageArrayIndex];
        return totalBeveragePrice;
      }

  }


  public String getEntertainment(){
    // String returnVal = "test";
    return mEntertainment;
  }
  public void setEntertainment(String usrEntertainment){
    mEntertainment = usrEntertainment;
  }


}
