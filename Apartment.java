
public class Apartment extends Residential {
	
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	public Apartment()
	{
		super();
		numRentableUnits = 0;
		avgUnitSize = 0;
		parkingAvailable = true;
	}
	
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup)
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		numRentableUnits = 0;
		avgUnitSize = 0;
		parkingAvailable = true;
	}
	
	//setters
	public void setNumRentableUnits(int rentableUnits)
	{
		numRentableUnits = rentableUnits;
	}
	
	public void setAvgUnitSize(double unitSize)
	{
		avgUnitSize = unitSize;
	}
	
	public void setParkingAvailable(boolean parkingAvailable)
	{
		this.parkingAvailable = parkingAvailable;
	}
	
	//getters
	public int getNumRentableUnits()
	{
		return numRentableUnits;
	}
	
	public double getAvgUnitSize()
	{
		return avgUnitSize;
	}
	
	public boolean getParkingAvailable()
	{
		return parkingAvailable;
	}
	
	
	public void draw()
	{
		System.out.println("\nDrawing code for Apartment.");
	}
	
	public String displayData()
	{
		String data;
		
		data = "\nApartment";
		data += "\n------------------------------------------";
		data += "\nProject Name: " + projectName;
		data += "\nAddress: " + completeAddress;
		data += "\nSquare Feet: " + totalSquareFeet;
		data += "\nOccupancy Group: " + occupancyGroup;
		data += "\nOccupancy Subgroup: " + subGroup;
		data += "\nBedrooms: " + numBedrooms;
		data += "\nBathrooms: " + numBathrooms;
		
		if(laundryRoom)
			data += "\nLaundry Room: Y";
		else
			data += "\nLaundry Room: N";
		
		data += "\nRentable Units: " + numRentableUnits;
		data += "\nAverage Unit Size: " + avgUnitSize;
		
		if(parkingAvailable)
			data += "\nAvailable Parking: Y";
		else
			data += "\nAvailable Parking: N";
		
		return data;
	}
	

}
