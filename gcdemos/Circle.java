package gcdemos;

public class Circle {

	private double radius;
	
	
	
	public Circle() {//will not be used once public Circle() is called again
		super();
		this.radius = 0.00;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	
	@Override
	public String toString(){
		return String.format("Radius: %.2f", radius);
	}
	
	
	
	public double areaCalc() {		//keep arg empty so to enhance abstraction
		return (Math.PI)*(radius*radius);
	}
	
	public double circumCalc() {
		return 2*(Math.PI* radius);
	}
}
