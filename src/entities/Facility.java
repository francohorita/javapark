package entities;

public interface Facility {
	public void book(Integer cant, Integer hora, Integer usuario);
	public Integer getDelay();
	public void closeFacility();
	public void closeFacility(Integer delay);
	public void setCapacity(Integer capacity);
	public Integer getCapacity();
}
