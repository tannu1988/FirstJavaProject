package learnInheritance;

public class VehicleMain {

	public static void main(String[] args) {
//		TwoWheeler bike = new TwoWheeler();
//	    FourWheeler car = new FourWheeler();
//	    bike.showPrice();
//	    bike.finalPrice();
//	    car.showPrice();
//	    car.finalPrice();

		
		
		//parent reference variable
		Vehicle vehicle = new TwoWheeler();
		TwoWheeler twowheeler=new TwoWheeler();
		Vehicle vehicle1 = new FourWheeler();
		vehicle.showPrice();
		twowheeler.finalPrice();
		vehicle1.showPrice();
	//	vehicle1.finalPrice();
		
	}

}
