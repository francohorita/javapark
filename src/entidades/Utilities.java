package entidades;

import java.time.Instant;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

public class Utilities {
	
	
	public static <T extends Facility> void setGenericCapacity(T buffer, Integer n) {
		buffer.setCapacity(n);
	}
	
	public static void statistics(Park myPark) throws ParkException {
		List<Game> games = new ArrayList<Game>();
		games = myPark.getGames();
		
		if(games.isEmpty())
			throw new ParkException("No se encontraron juegos en el parque");
		
		//3 Juegos menor demora
		Stream<Game> juegosLimitedStream = games.stream().sorted().limit(3);
		juegosLimitedStream.forEach(System.out::println);
		
		consoleDivider();
		
		//Promedio demora juegos (y más datos)
		IntSummaryStatistics parkStatics = 
				games.stream()
				.mapToInt(j -> j.getDelay())
				.summaryStatistics();
		
		System.out.printf(
			" Número de juegos = %d \n Juego con menor demora = %d \n Juego con mayor demora %d \n Promedio de demora = %f \n", 
            parkStatics.getCount(), parkStatics.getMin(), parkStatics.getMax(), parkStatics.getAverage());
		
	}
	
	public static void consoleDivider() {
		System.out.println("------------------------");
	}

}
