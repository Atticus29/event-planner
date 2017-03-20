import java.io.Console;

public class App{
	public static void main(String[] args) {
		Console myConsole = System.console();
		Event currentEvent = new Event();
		currentEvent.initializeCoupons();
		System.out.println("Welcome to Event Horizon, where we plan more than you fathom!");
		boolean truthVal = true;
		String promptStatement = "Please select from the following menu: View Random Event, Create Custom Event, View Specialty Packages, Exit";
		System.out.println(promptStatement);
		String usrSelection = myConsole.readLine();
		while(truthVal){
			if(usrSelection.equals("View Specialty Packages")){
				String specialtyPrompt = "Please select from the following menu: Wedding, Birthday, Reunion, Exit";
				System.out.println(specialtyPrompt);
				String usrSpecialtySelection = myConsole.readLine();
				boolean specialtyTruthVal = true;
				while(specialtyTruthVal == true){
					if(usrSpecialtySelection.equals("Exit")){
						specialtyTruthVal = false;
						System.out.println(promptStatement);
						usrSelection = myConsole.readLine();
					} else if(usrSpecialtySelection.equals("Wedding")){
						// Perry, I think I could DRY this out with a constructor, but not clear on usage of constructors in encapsulated setting...
						Event weddingEvent = new Event();
						weddingEvent.initializeCoupons();
						weddingEvent.setNumGuests(75);
						weddingEvent.setFood("plated-Meat");
						weddingEvent.setBeverage("Open Bar");
						weddingEvent.setEntertainment("DJ");
						weddingEvent.calculateTotalEventPrice();
						weddingEvent.applyCoupon("BRIDEZILLA2017");
						System.out.println("Special discount for the wedding package");
						System.out.println(weddingEvent.getEventDetailsString());
						System.out.println(specialtyPrompt);
						usrSpecialtySelection = myConsole.readLine();
					} else if(usrSpecialtySelection.equals("Birthday")){
						Event birthdayEvent = new Event();
						birthdayEvent.initializeCoupons();
						birthdayEvent.setNumGuests(15);
						birthdayEvent.setFood("light snack");
						birthdayEvent.setBeverage("none");
						birthdayEvent.setEntertainment("none");
						birthdayEvent.calculateTotalEventPrice();
						birthdayEvent.applyCoupon("HAPPYBIRTHDAY2017");
						System.out.println("Special discount for the birthday package");
						System.out.println(birthdayEvent.getEventDetailsString());
						System.out.println(specialtyPrompt);
						usrSpecialtySelection = myConsole.readLine();

					} else if(usrSpecialtySelection.equals("Reunion")){
						Event reunionEvent = new Event();
						reunionEvent.initializeCoupons();
						reunionEvent.setNumGuests(100);
						reunionEvent.setFood("buffet-Meat");
						reunionEvent.setBeverage("Open Bar");
						reunionEvent.setEntertainment("Live Band");
						reunionEvent.calculateTotalEventPrice();
						reunionEvent.applyCoupon("LONGLOSTRELATIVES2017");
						System.out.println("Special discount for the reunion package");
						System.out.println(reunionEvent.getEventDetailsString());
						System.out.println(specialtyPrompt);
						usrSpecialtySelection = myConsole.readLine();

					} else{
						System.out.println(specialtyPrompt);
						usrSpecialtySelection = myConsole.readLine();
					}
				}
			}
			else if(usrSelection.equals("Create Custom Event")){
				currentEvent = new Event();
				currentEvent.initializeCoupons();
				while(!currentEvent.isValidNumber()){
					System.out.println("How many guests do you plan on having at your event?");
					Integer usrGuests = Integer.parseInt(myConsole.readLine());
					currentEvent.setNumGuests(usrGuests);
				}
				while(!currentEvent.isValidFood()){
					System.out.println("What kind of food were you thinking? Please type: 'buffet-Vegetarian', 'buffet-Meat', 'plated-Meat', 'plated-Vegetarian', or 'plated-Fish', 'none'");
					String usrFood = myConsole.readLine();
					currentEvent.setFood(usrFood);
				}
				while(!currentEvent.isValidBeverage()){
					System.out.println("What kind of beverage were you thinking? Please type: 'Open Bar', 'Pay Bar', or 'Non-alcoholic Bar', 'none' ");
					String usrBeverage = myConsole.readLine();
					currentEvent.setBeverage(usrBeverage);
				}
				while(!currentEvent.isValidEntertainment()){
					System.out.println("What kind of entertainment were you thinking? Please type: 'DJ', 'Live Band', or 'Photo Booth', 'none'");
					String usrEntertainment = myConsole.readLine();
					currentEvent.setEntertainment(usrEntertainment);
				}
				currentEvent.calculateTotalEventPrice();
				System.out.println("If you have a coupon code, please enter it now");
				String usrCouponCode = myConsole.readLine();
				if(currentEvent.isValidCoupon(usrCouponCode)){
					System.out.println("Congratulations! Your coupon is valid!");
					currentEvent.applyCoupon(usrCouponCode);
				}
				System.out.println(currentEvent.getEventDetailsString());
				System.out.println(promptStatement);
				usrSelection = myConsole.readLine();
			}
			else if(usrSelection.equals("View Random Event")){
				Event randomEvent = new Event();
				randomEvent.initializeCoupons();
				randomEvent.generateRandomEvent();
				System.out.println(randomEvent.getEventDetailsString());
				System.out.println(promptStatement);
				usrSelection = myConsole.readLine();
			}
			else if(usrSelection.equals("Exit")){
				truthVal = false;
			} else{
				System.out.println(promptStatement);
				usrSelection = myConsole.readLine();
			}
		}
	}
}
