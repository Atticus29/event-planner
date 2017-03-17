import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Event{

  // Attributes
  // _________________________________________________
  private String mFood;
  private Integer mNumGuests;
  private String mBeverage;
  private String mEntertainment;
  private List<String> mPotentialCoupons = new ArrayList<String>();
  private List<Double> mPotentialCouponDiscounts = new ArrayList<Double>();
  private double mTotalPrice;

  // Constructor
  // _________________________________________________
  public Event(){


  }

  // Guests
  // _________________________________________________
  public Integer getNumGuests(){
    // Integer returnVal = 3;
    return mNumGuests;
  }
  public void setNumGuests(int usrNumGuests){
    mNumGuests = usrNumGuests;
  }

  public boolean isValidNumber(){
    if(mNumGuests instanceof Integer && mNumGuests > 0){
      return true;
    } else{
      return false;
    }
  }

  // Food
  // _________________________________________________
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


  // Drinks
  // _________________________________________________
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

  // Entertainment
  // _________________________________________________
  public String getEntertainment(){
    // String returnVal = "test";
    return mEntertainment;
  }
  public void setEntertainment(String usrEntertainment){
    mEntertainment = usrEntertainment;
  }
  public boolean isValidEntertainment(){
    String[] validEntertainment = {"DJ", "Live Band", "Photo Booth"};
    return Arrays.asList(validEntertainment).contains(mEntertainment);
  }
  public double calculateEntertainmentPrice(){
    String[] validEntertainment = {"DJ", "Live Band", "Photo Booth"};
    Integer[] entertainmentPrices = {400, 900, 700};
    int entertainmentArrayIndex = Arrays.asList(validEntertainment).indexOf(mEntertainment);
    double totalEntertainmentPrice = entertainmentPrices[entertainmentArrayIndex];
    return totalEntertainmentPrice;
  }

  // Total Price
  // _________________________________________________
  public double calculateTotalEventPrice(){
    double foodCost = calculateFoodPrice();
    double beverageCost = calculateBeveragePrice();
    double entertainmentCost = calculateEntertainmentPrice();
    double venueCost = mNumGuests * 25;
    double totalPrice =  foodCost + beverageCost + entertainmentCost + venueCost;
    mTotalPrice = totalPrice;
    return totalPrice;
  }

  // Couponing
  // _________________________________________________
  public List<String> getPotentialCoupons(){
    return mPotentialCoupons;
  }

  // Perry, is this the best way to do this, or should I declare the arrays this way in the attributes section?
  public void initializeCoupons(){
    mPotentialCoupons.add("WINTERWEDDING2017");
    mPotentialCoupons.add("BESTIESWITHEVENTPLANNER2017");
    mPotentialCoupons.add("BRIDEZILLA2017");
    mPotentialCouponDiscounts.add(0.85);
    mPotentialCouponDiscounts.add(0.5);
    mPotentialCouponDiscounts.add(0.65);
  }

  public boolean isValidCoupon(String coupon){
    return mPotentialCoupons.contains(coupon);
  }


  public double applyCoupon(String coupon){
    int couponArrayIndex = mPotentialCoupons.indexOf(coupon);
    System.out.println("couponArrayIndex is " + couponArrayIndex);
    if(couponArrayIndex >=0){
      double discount = mPotentialCouponDiscounts.get(couponArrayIndex);
      double updatedPrice = mTotalPrice * discount;
      return updatedPrice;
    } else{
      return mTotalPrice * 1;
    }
  }


}
