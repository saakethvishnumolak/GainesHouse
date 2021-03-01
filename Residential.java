
public class Residential extends Building
{
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential()
	{
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup)
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}
	
	//setters
	public void setNumBedrooms(int bedrooms)
	{
		numBedrooms = bedrooms;
	}
	
	public void setNumBathrooms(int bathrooms)
	{
		numBathrooms = bathrooms;
	}
	
	public void setLaundryRoom(boolean laundryRoom)
	{
		this.laundryRoom = laundryRoom;
	}
	
	//getters
	public int getNumBedrooms()
	{
		return numBedrooms;
	}
	
	public int getNumBathrooms()
	{
		return numBathrooms;
	}
	
	public boolean getLaundryRoom()
	{
		return laundryRoom;
	}
}

