package co.grandcircus.bikes;

public class ElectricBike extends Bike{

	private int charge = 10;
	

	public int getCharge() {
		return charge;
	}
	
	public void go() {
		super.go();//grabs parent method
		--charge;
		if(charge == 0) {
			speed = 0;
			System.out.println("LOW BATTERY. Please recharge.");
		}
		
	}
	public void recharge() {
		speed = 0;
		charge = 10;
		System.out.println("...\nCHARGING COMPLETE. Please unplug your bike.");
	}
	
	public ElectricBike() {
		
	}
	
	public ElectricBike(String color) {
		super(color);
	}
	
	@Override
	public String toString() {
		return String.format("[color: %s, speed: %s, charge: %s]",color,speed,charge);
	}
	
}
