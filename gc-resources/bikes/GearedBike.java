package co.grandcircus.bikes;

public class GearedBike extends Bike {

	
	
	private int gear = 4;
	
	public int getGear() {
		return gear;
	}
	
	@Override	//hints java the intention for no slip ups but proper methods are used automatically
	public void go() {
		speed+=gear;
	}
	
	//default constructor created behind the scenes automatically & grabbed from parent class, but once a constructor is created it gets removed
	public GearedBike() {
		super();
	}
	
	public GearedBike(String color) {
		super(color);//can be different var names; is only looking for a constructor with 1 string inside of it
	}
	
	public void shiftUp() {
		++gear;
	}
	
	public void shiftDown() {
		--gear;
	}
	
	
	
}
