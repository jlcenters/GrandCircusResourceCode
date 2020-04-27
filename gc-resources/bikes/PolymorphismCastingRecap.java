package co.grandcircus.bikes;

public class PolymorphismCastingRecap {

	public static void main(String[] args) {
		Bike bike = new Bike();
		GearedBike gearedBike = new GearedBike();
		Bike bike2 = new GearedBike();
		//GearedBike bike4 = new Bike(); CANNOT PUT A PARENT IN A CHILD; not every bike is a gearedbike
		
		bike.go();
		gearedBike.go();
		//bike.shiftUp(); same instance; not every bike can shift up
		//bike2.shiftUp(); we told Java that bike2 might be a Bike, so is not able to use GearedBike methods
		
		//System.out.println("instanceof GearedBike: " + (thisBike instanceof GearedBike)); //LEFT = variable; RIGHT = class; boolean comparison
		
		//BIKE: IO BIKE
		//GBIKE: IO GBIKE
		//BIKE: !IO GBIKE
		//GBIKE: IO BIKE contextually; .equals checks exactly and would print false
		
		//implicit cast
		Bike bike3 = gearedBike;
		
		//explicit cast
		GearedBike gearedBike2 = (GearedBike)bike;
		
	}
	

}
