package entidades;

public class ParkException extends Exception {

	private static final long serialVersionUID = -6435868738815737361L;
	
    public ParkException() {}

    public ParkException(String message){
       super(message);
    }
	
}
