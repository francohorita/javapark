package entities;

public class RollerCoaster extends Game {
	
	private Integer height;
	private Train train;
	
	public RollerCoaster(Integer height, String name, Integer delay, Integer requiredAge) {
		this.height = height;
		this.name = name;
		this.delay = delay;
		this.requiredAge = requiredAge;
	}

	public Integer getDelay() {
		return delay;
	}

	public Integer getHeight() {
		return this.height;
	}

	public void closeFacility() {
		// TODO
	}

	public void closeFacility(Integer delay) {
		// TODO
	}

}
