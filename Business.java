
public class Business extends Building
{
	protected int numRentableUnits;
	
	public Business()
	{
		super();
		numRentableUnits = 0;
	}
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup)
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		numRentableUnits = 0;
	}
	
	//setter and getter
	public void setNumRentableUnits(int rentableUnits)
	{
		numRentableUnits = rentableUnits;
	}
	
	public int getNumRentableUnits()
	{
		return numRentableUnits;
	}
	
}
