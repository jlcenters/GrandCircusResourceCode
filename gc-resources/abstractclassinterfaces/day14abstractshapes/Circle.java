package day14abstractshapes;

public class Circle implements Shape{
	
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	@Override
	public double calcArea() {
		
		return Math.PI * Math.pow(radius, 2);
	}
	
	

}