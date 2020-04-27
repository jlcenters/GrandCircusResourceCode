package co.grandcircus.bikes;

public class BikeApp {

	public static void main(String[] args) {
		Bike redBike = new Bike("red");
		System.out.println(redBike);
		System.out.println(redBike.getColor());
		System.out.println(redBike.getSpeed());
		redBike.go();
		System.out.println(redBike);
		
		
		GearedBike newBike = new GearedBike();
		System.out.println(newBike.getColor());
		newBike.go();
		System.out.println(newBike);
		
		GearedBike bike4 = new GearedBike("purple");
		System.out.println(bike4);
		
		ElectricBike coolBike = new ElectricBike("navy blue");
		coolBike.go();
		coolBike.go();
		coolBike.go();
		coolBike.go();
		System.out.println(coolBike);
		coolBike.go();
		coolBike.go();
		coolBike.go();
		coolBike.go();
		coolBike.go();
		System.out.println(coolBike);
		coolBike.go();
		coolBike.recharge();
	}

}
