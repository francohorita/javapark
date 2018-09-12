package entities;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		//Park
		Park park = Park.getInstance();

		//Games
		RollerCoaster roller1 =  new RollerCoaster(10, "Roller Coaster", 20, 5);
		RollerCoaster roller2 =  new RollerCoaster(15, "Super Roller", 10, 30);
		RollerCoaster roller3 =  new RollerCoaster(15, "Super Coaster", 20, 10);
		WaterSlide slide1 =  new WaterSlide("Red Water Slide", 30, 30);
		WaterSlide slide2 =  new WaterSlide("Super Water Slide", 10, 20);

		//Restaurant
		Restaurant restaurant = new Restaurant();

		//Booking List
		List<Booking> bookings = new ArrayList<>();
		
		LocalTime bookTime1 = LocalTime.of(11, 35, 00, 00000);
		LocalTime bookTime2 = LocalTime.of(13, 15, 00, 00000);

		//Visitors
        Visitor visitor1 = new Visitor(1, "Carl");
        Visitor visitor2 = new Visitor(2, "Aixa");

		//Bookings
		Booking rolller1Booking = new Booking(roller1, bookTime1, visitor1);
		Booking slide1Booking = new Booking(slide1, bookTime1, visitor2);
		Booking restaurantBooking = new Booking(restaurant, bookTime2, visitor1);
		Booking restaurantBooking2 = new Booking(restaurant, visitor2);
        
		park.initPark();
		
		try {
			Utilities.statistics(park);
		} catch (ParkException pe) {
			System.out.println(pe.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		park.addGame(roller1);
		park.addGame(roller2);
		park.addGame(roller3);
		park.addGame(slide1);
		park.addGame(slide2);
		park.addRestaurant(restaurant);
		
		bookings.add(rolller1Booking);
		bookings.add(slide1Booking);
		bookings.add(restaurantBooking);
		bookings.add(restaurantBooking2);
		
		Utilities.setGenericCapacity(roller1, 10);
		
		Utilities.consoleDivider();
		
		System.out.println(roller1.getHeight());
		System.out.println(roller2.getHeight());
		System.out.println(roller1.getCapacity());
		
		Utilities.consoleDivider();
		
		park.delayedGames(20).forEach(System.out::println);
		
		Utilities.consoleDivider();
		
		park.delayedGames(20,20).forEach(System.out::println);
		
		Utilities.consoleDivider();
		
		try {
			Utilities.statistics(park);
		} catch (ParkException pe) {
			System.out.println(pe.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}