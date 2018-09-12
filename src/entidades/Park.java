package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Park {
	
	//SINGLETON</
	private static Park instance = null;
	
	private Park() {}

	public static Park getInstance() {
		if (instance == null) {
			instance = new Park();
		}
		return instance;
	}
	//SINGLETON/>
	
	ParkPk parqueId;
	private Integer capacity;
	private Integer area;
	
	private List<Game> games;
	private List<Restaurant> restaurants;

	public void addGame(Game juego) {
		games.add(juego);
	}
	
	public List<Game> getGames() {
		return games;
	}
	
	public void addRestaurant(Restaurant restaurant) {
		restaurants.add(restaurant);
	}

	public void initPark() {
		games = new ArrayList<Game>();
		restaurants = new ArrayList<Restaurant>();
	}
	
	public void close() {
		for (Facility facility : this.games) {
			facility.closeFacility(20);
		}
		for (Facility facility : this.restaurants) {
			facility.closeFacility();
		}
	}
	
	public Stream<String> delayedGames(Integer maxDelay){
		Predicate<Game> delay = g -> g.getDelay() <= maxDelay;
		
		return this.games.stream()
				.filter(delay)
				.map(g -> g.getName());
	}
	
	public Stream<String> delayedGames(Integer maxDelay, Integer requiredAge){
		Predicate<Game> delay = g -> g.getDelay() <= maxDelay;
		Predicate<Game> age = g -> g.getRequiredAge() >= requiredAge;
		Predicate<Game> delayAndRequiredAge = delay.and(age);
		
		return this.games.stream()
				.filter(delayAndRequiredAge)
				.map(g -> g.getName());
	}

}
