package gcdemos;

public class Rectangle {
	//PRIV INSTNANCE VARS
	private double length;
	private double width;
	
	
	
	//GETTERS AND SETTERS
	public void setLength(double length) {
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	
	
	//CONSTRUCTOR GRABBING BOTH
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	
	
	//VOID CONSTRUCTOR
	public Rectangle() {
		super();
		this.length = 0.00;
		this.width = 0.00;
	}
	
	
	
	//TOSTRING
	@Override
	public String toString() {
		return String.format("Length: %.2f, Width: %.2f", length, width);
	}
	
	
	
	public double calcArea(double length, double width) {
		return length * width;
	}
	
	
	
	public double calcPerimeter(double length, double width) {
		return (length*2) + (width*2);
	}
}
