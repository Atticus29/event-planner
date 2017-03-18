import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;

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
  private String[] mValidFood = {"buffet-Vegetarian", "buffet-Meat", "plated-Meat", "plated-Vegetarian", "plated-Fish", "light snack"};
  private Integer[] mFoodPrices = {12, 15, 25, 18, 26, 10};
  private String[] mValidBeverage = {"Open Bar", "Pay Bar", "Non-alcoholic Bar"};
  private Integer[] mBeveragePrices = {40, 150, 100};
  private String[] mValidEntertainment = {"DJ", "Live Band", "Photo Booth"};
  private Integer[] mEntertainmentPrices = {400, 900, 700};

  // Constructor and other event methods
  // _________________________________________________
  public Event(){


  }

  public void generateRandomEvent(){
    // Event newEvent = new Event();
    Random randObj = new Random();
    // Guest count arbitrarily capped at 500
    int randomGuestCount = randObj.nextInt(499)+1;
    // System.out.println("randomGuestCount is " + randomGuestCount);
    mNumGuests = randomGuestCount;
    // newEvent.setNumGuests(randomGuestCount);
    int randomFoodIndex = randObj.nextInt(mValidFood.length);
    mFood = mValidFood[randomFoodIndex];
    // newEvent.setFood(mValidFood.get(randomFoodIndex));
    int randomBeverageIndex = randObj.nextInt(mValidBeverage.length);
    mBeverage = mValidBeverage[randomBeverageIndex];
    // newEvent.setBeverage(mValidBeverage.get(randomBeverageIndex));
    int randomEntertainmentIndex = randObj.nextInt(mValidEntertainment.length);
    mEntertainment = mValidEntertainment[randomEntertainmentIndex];
    mTotalPrice = calculateTotalEventPrice();
    // newEvent.setEntertainment(mValidEntertainment.get(randomEntertainmentIndex));
    // return newEvent;

  }

  public String getEventDetailsString(){
    String sentence = String.format("Let's see. That's %s guests eating %s, drinking from a(n) %s, and being entertained by a %s. \nThe total cost comes to: $%.2f", mNumGuests, mFood, mBeverage, mEntertainment, mTotalPrice);
    return sentence;
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
    return Arrays.asList(mValidFood).contains(mFood);
  }
  public double calculateFoodPrice(){

    int foodArrayIndex = Arrays.asList(mValidFood).indexOf(mFood);
    double pricePerGuest = mFoodPrices[foodArrayIndex];
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

    return Arrays.asList(mValidBeverage).contains(mBeverage);
  }
  public double calculateBeveragePrice(){

    int beverageArrayIndex = Arrays.asList(mValidBeverage).indexOf(mBeverage);
    if (beverageArrayIndex == 0){
      double pricePerGuest = mBeveragePrices[beverageArrayIndex];
      double totalBeveragePrice = pricePerGuest * mNumGuests;
      return totalBeveragePrice;
    } else {
      double totalBeveragePrice = mBeveragePrices[beverageArrayIndex];
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

    return Arrays.asList(mValidEntertainment).contains(mEntertainment);
  }
  public double calculateEntertainmentPrice(){
    int entertainmentArrayIndex = Arrays.asList(mValidEntertainment).indexOf(mEntertainment);
    double totalEntertainmentPrice = mEntertainmentPrices[entertainmentArrayIndex];
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

  public Double getTotalPrice (){
    return mTotalPrice;
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
    // System.out.println("couponArrayIndex is " + couponArrayIndex);
    if(couponArrayIndex >=0){
      // System.out.println("you got into the if statement");
      double discount = mPotentialCouponDiscounts.get(couponArrayIndex);
      // System.out.println("Discount is " + discount);
      // double originalPrice = mTotalPrice;
      double updatedPrice = mTotalPrice * discount;
      mTotalPrice *= discount;
      return updatedPrice;
    } else{
      return mTotalPrice * 1;
    }
  }


}
