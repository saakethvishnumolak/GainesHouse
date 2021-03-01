
public class Mall extends Business {
	
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	public Mall()
	{
		super();
		numRentedUnits = 0;
		medianUnitSize = 0;
		numParkingSpaces = 0;
	}
	
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup)
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		numRentedUnits = 0;
		medianUnitSize = 0;
		numParkingSpaces = 0;
	}
	
	//setters
	public void setNumRentedUnits(int rentedUnits)
	{
		numRentedUnits = rentedUnits;
	}
	
	public void setMedianUnitSize(double unitSize)
	{
		medianUnitSize = unitSize;
	}
	public void setNumParkingSpaces(int parkingSpaces)
	{
		numParkingSpaces = parkingSpaces;
	}
	
	//getters
	public int getNumRentedUnits()
	{
		return numRentedUnits;
	}
	
	public double getMedianUnitSize()
	{
		return medianUnitSize;
	}
	
	public int getNumParkingSpaces()
	{
		return numParkingSpaces;
	}
	
	public void draw()
	{
		System.out.println("\nDrawing code for Mall.");
	}
	
	public String displayData()
	{
		String data;
		
		data = "\nMall";
		data += "\n------------------------------------------";
		data += "\nProject Name: " + projectName;
		data += "\nAddress: " + completeAddress;
		data += "\nSquare Feet: " + totalSquareFeet;
		data += "\nOccupancy Group: " + occupancyGroup;
		data += "\nOccupancy Subgroup: " + subGroup;
		data += "\nRentable Units: " + numRentableUnits;
		data += "\nRented Units: " + numRentedUnits;
		data += "\nMedian of Unit Sizes: " + medianUnitSize;
		data += "\nNumber of Parking Spaces: " + numParkingSpaces;
		
		return data;
 	}
	
	

}
