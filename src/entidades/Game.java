package entidades;

public abstract class Game implements Facility, Comparable<Game> {
	
	private ParkPk parkId;
	private Park park;
	private Integer capacity;
	private Integer duration;
	protected String name;
	protected Integer requiredAge;
	protected Integer delay;
	
	public Game() {}
	
	
	public Park getPark() {
		return park;
	}
	
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public String getName() {
		return name;
	}

	public Integer getRequiredAge() {
		return 10;
	}
	
	public int compareTo(Game g) {
		return Integer.compare(delay, g.delay);
	}

	@Override
	public String toString() {
		return "Juego [parqueId=" + parkId + ", parque=" + park + ", capacidad=" + capacity + ", duracion="
				+ duration + ", nombre=" + name + ", edadMinima=" + requiredAge + ", demora=" + delay + "]";
	}
	
	public void book(Integer cant, Integer hora, Integer usuario) {
		
	}
	
}
