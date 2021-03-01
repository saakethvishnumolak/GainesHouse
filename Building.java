
public class Building 
{
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subGroup;
	
	public Building()
	{
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0;
		occupancyGroup = "";
		subGroup = "";
	}
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup)
	{
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
	}
	
	public void draw()
	{
		System.out.println("Drawing code for Building.");
	}
	
	public String displayData()
	{
		String data;
		data = "\nBuilding";
		data += "\n------------------------------------------";
		data += "\nProject Name: " + projectName;
		data += "\nAddress: " + completeAddress;
		data += "\nSquare Feet: " + totalSquareFeet;
		data += "\nOccupancy Group: " + occupancyGroup;
		data += "\nOccupancy Subgroup: " + subGroup;
		
		return data;
	}
}