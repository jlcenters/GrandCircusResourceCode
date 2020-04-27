package co.grandcircus.bikes;

public class Bike {

	protected String color; //protected so that subclasses can inherit
	protected int speed = 0;	//wants speed to start at 0 always
	
	public Bike() {
		color = "black";
	}
	
	public Bike(String color) {
		super();
		this.color = color;
	}
	
	public void go() {
		speed++;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() { //can't immediately set speed
		return speed;
	}

	@Override
	public String toString() {
		return "Bike [color: " + color + ", speed: " + speed + "]";
	}
	
	
	
	
	
}
