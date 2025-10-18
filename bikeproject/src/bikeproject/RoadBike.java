package bikeproject;


interface RoadParts {
    // constant declaration
    public static final String terrain = "track_racing";

    // required methods after implementation
    public String getTyreWidth();
    public void setTyreWidth(String newValue);
    public String getPostHeight();
    public void setPostHeight(String newValue);
}
// end interface RoadParts

public class RoadBike extends Bike implements RoadParts {
	
	private int tyreWidth, postHeight;
	
	public RoadBike()
	{
		this("drop", "racing", "tread less", "razor", 19, 20, 22);
	}//end constructor
	
	public RoadBike(int postHeight)
	{
		this("drop", "racing", "tread less", "razor", 19, 20, postHeight);
	}//end constructor
		
	public RoadBike(String handleBars, String frame, String tyres, String seatType, int numGears,
			int tyreWidth, int postHeight) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.tyreWidth = tyreWidth;
		this.postHeight = postHeight;
	}//end constructor

	// RoadParts interface methods
	@Override
	public String getTyreWidth() {
		return Integer.toString(tyreWidth);
	}

	@Override
	public void setTyreWidth(String newValue) {
		try {
			this.tyreWidth = Integer.parseInt(newValue);
		} catch (NumberFormatException e) {
			// Optionally handle invalid input
		}
	}

	@Override
	public String getPostHeight() {
		return Integer.toString(postHeight);
	}

	@Override
	public void setPostHeight(String newValue) {
		try {
			this.postHeight = Integer.parseInt(newValue);
		} catch (NumberFormatException e) {
			// Optionally handle invalid input
		}
	}
	
	public void printDescription()
	{
		super.printDescription();
		System.out.println("This Roadbike bike has " + this.tyreWidth + "mm tyres and a post height of " + this.postHeight + ".");
	}//end method printDescription
}//end class RoadBike
