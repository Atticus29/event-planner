import java.io.Console;

public class App{
	public static void main(String[] args) {
		Console myConsole = System.console();
		Event currentEvent = new Event();
		currentEvent.initializeCoupons();
		System.out.println("Welcome to Event Horizon, where we plan more than you fathom!");
		while(!currentEvent.isValidNumber()){
			System.out.println("How many guests do you plan on having at your event?");
			Integer usrGuests = Integer.parseInt(myConsole.readLine());
			currentEvent.setNumGuests(usrGuests);
		}
		while(!currentEvent.isValidFood()){
			System.out.println("What kind of food were you thinking? Please type: 'buffet-Vegetarian', 'buffet-Meat', 'plated-Meat', 'plated-Vegetarian', or 'plated-Fish'");
			String usrFood = myConsole.readLine();
			currentEvent.setFood(usrFood);
		}
		while(!currentEvent.isValidBeverage()){
			System.out.println("What kind of beverage were you thinking? Please type: 'Open Bar', 'Pay Bar', or 'Non-alcoholic' ");
			String usrBeverage = myConsole.readLine();
			currentEvent.setBeverage(usrBeverage);
		}
		while(!currentEvent.isValidEntertainment()){
			System.out.println("What kind of entertainment were you thinking? Please type: 'DJ', 'Live Band', or 'Photo Booth'");
			String usrEntertainment = myConsole.readLine();
			currentEvent.setEntertainment(usrEntertainment);
		}
		System.out.println("If you have a coupon code, please enter it now");
		String usrCouponCode = myConsole.readLine();
		if(currentEvent.isValidCoupon(usrCouponCode)){
			currentEvent.applyCoupon(usrCouponCode);
		}

		currentEvent.calculateTotalEventPrice();
		System.out.printf("Your event would cost: $%.2f", currentEvent.getTotalPrice());

	}
}
