package entities;

public abstract class Game implements Facility, Comparable<Game> {
	
	private ParkPk parkId;
	private Park park;
	private Integer capacity;
	private Integer duration;
	protected String name;
	protected Integer delay;
	protected Integer requiredAge;
	
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
		return requiredAge;
	}
	
	public int compareTo(Game g) {
		return Integer.compare(delay, g.delay);
	}

	@Override
	public String toString() {
		return "Game [name=" + name + ", requiredAge=" + requiredAge + ", delay=" + delay + "]";
	}
	
	public void book(Integer quant, Integer hour, Integer user) {
		// TODO
	}
	
}
