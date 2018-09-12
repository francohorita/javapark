package entities;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

public class Utilities {
	
	
	public static <T extends Facility> void setGenericCapacity(T buffer, Integer capacity) {
		buffer.setCapacity(capacity);
	}
	
	public static void statistics(Park myPark) throws ParkException {
		List<Game> games = new ArrayList<Game>();
		games = myPark.getGames();
		
		if(games.isEmpty())
			throw new ParkException("No games found");
		
		//3 Game with less delay
		Stream<Game> limitedGamesStream = games.stream().sorted().limit(3);
		limitedGamesStream.forEach(System.out::println);
		
		consoleDivider();
		
		IntSummaryStatistics parkStatics =
				games.stream()
				.mapToInt(j -> j.getDelay())
				.summaryStatistics();
		
		System.out.printf(
			" Games = %d \n Game with less delay = %d \n Game with greater delay = %d \n Average delay = %f \n",
            parkStatics.getCount(), parkStatics.getMin(), parkStatics.getMax(), parkStatics.getAverage());
		
	}
	
	public static void consoleDivider() {
		System.out.println("------------------------");
	}

}
