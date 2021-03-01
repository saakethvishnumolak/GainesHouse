
public class SingleFamilyHome extends Residential {
	
	private boolean garage;
	
	public SingleFamilyHome()
	{
		super();
		garage = true;
	}
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup)
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		garage = true;
	}
	
	//setter and getter
	public void setGarage(boolean garage)
	{
		this.garage = garage;
	}
	
	public boolean getGarage()
	{
		return garage;
	}
	
	public void draw()
	{
		System.out.println("\nDrawing code for SingleFamilyHome.");
	}
	
	public String displayData()
	{
		
		String data;
		
		data = "\nSingle Family Home";
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
		
		if(garage)
			data += "\nGarage: Y";
		else
			data += "\nGarage: N";
		
		return data;
	}

}
