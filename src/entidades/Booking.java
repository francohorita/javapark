package entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Booking {
	Facility facility;
	LocalDateTime bookTime;
	Visitor visitor;
    
	public Booking(Facility facility, LocalTime bookTime, Visitor visitor) {
		this.facility = facility;
		this.bookTime = LocalDate.now().atTime(bookTime);
		this.visitor = visitor;
	}

	public Booking(Facility facility, Visitor visitor) {
		this.facility = facility;
		this.bookTime = LocalDateTime.now();
		this.visitor = visitor;
	}
}
