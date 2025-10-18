package bikeproject;
interface BikeParts {
//constant declaration 
public final String MAKE = "Oracle Bikes"; 
//required methods after implementation
public String getHandleBars();
public void setHandleBars(String newValue);
public String getTyres();
public void setTyres(String newValue);
public String getSeatType();
public void setSeatType(String newValue); 
}
//end interface BikeParts


public class Bike implements BikeParts {

	private String handleBars, frame, tyres, seatType;
	private int NumGears;
	private final String make;
	
	public Bike(){  
		this.make = "Oracle Cycles";
	}//end constructor
	
	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		NumGears = numGears;
		this.make = "Oracle Cycles";
	}//end constructor

	// BikeParts interface methods
	@Override
	public String getHandleBars() {
		return handleBars;
	}

	@Override
	public void setHandleBars(String newValue) {
		this.handleBars = newValue;
	}

	@Override
	public String getTyres() {
		return tyres;
	}

	@Override
	public void setTyres(String newValue) {
		this.tyres = newValue;
	}

	@Override
	public String getSeatType() {
		return seatType;
	}

	@Override
	public void setSeatType(String newValue) {
		this.seatType = newValue;
	}

	protected void printDescription()
	{
		System.out.println("\n" + this.make + "\n" 
				          + "This bike has " + this.handleBars + " handlebars on a " 
				          + this.frame + " frame with " + this.NumGears + " gears."  
				          + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
	}//end method printDescription

}//end class Bike
	
	

