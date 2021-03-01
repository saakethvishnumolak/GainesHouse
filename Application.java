
public class Application {

	public static void main(String[] args) {
		
		//building
		Building myBuilding = new Building("Gaines House", "12744 Tram Lane 46032 Carmel, IN", 2500, "Residential", "R-2");
		myBuilding.draw();
		System.out.println(myBuilding.displayData());
		
		//mall
		Mall myMall = new Mall("Gaines House", "45242 Meadow Road 620 Phoenix, AZ", 2000000, "Business", "Group B");
		myMall.setNumRentableUnits(100);
		myMall.setNumRentedUnits(57);
		myMall.setMedianUnitSize(2137.55);
		myMall.setNumParkingSpaces(10000);
		myMall.draw();
		System.out.println(myMall.displayData());
		
		//apartment
		Apartment myApt = new Apartment("Gaines House", "885 6th Avenue 10001 New York, NY", 25000, "Residential", "R-3");
		myApt.setNumBedrooms(1);
		myApt.setNumBathrooms(1);
		myApt.setLaundryRoom(false);
		myApt.setNumRentableUnits(55);
		myApt.setAvgUnitSize(460.8);
		myApt.setParkingAvailable(true);
		myApt.draw();
		System.out.println(myApt.displayData());
		
		//singlefamilyhome
		SingleFamilyHome myHome = new SingleFamilyHome("Gaines House", "3801 Casanova Drive 94403 San Mateo, CA", 2750, "Residential", "R-1");
		myHome.setNumBedrooms(3);
		myHome.setNumBathrooms(4);
		myHome.setLaundryRoom(true);
		myHome.setGarage(true);
		myHome.draw();
		System.out.println(myHome.displayData());
	}

}
