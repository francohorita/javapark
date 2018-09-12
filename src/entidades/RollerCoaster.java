package entidades;

public class RollerCoaster extends Game {
	
	private Integer height;
	private Train train;
	
	public RollerCoaster(Integer height, String name, Integer delay) {
		this.height = height;
		this.name = name;
		this.delay = delay;
	}

	public Integer getDelay() {
		return delay;
	}

	public Integer getHeight() {
		return this.height;
	}

	public void closeFacility() {
		// TODO Auto-generated method stub
		
	}

	public void closeFacility(Integer delay) {
		// TODO Auto-generated method stub
		
	}
	
	public Integer getRequiredAge() {
		return 10;
	}

}
