package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Booking {
	private Facility facility;
	private LocalDateTime bookTime;
	private Visitor visitor;
    
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
