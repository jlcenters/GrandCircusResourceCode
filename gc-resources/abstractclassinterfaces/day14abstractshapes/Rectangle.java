package day14abstractshapes;

public class Rectangle implements Shape{
	
	private double length;
	private double width;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setPerimeters(double length,double width) {
		this.length = length;
		this.width = width;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	@Override
	public double calcArea() {		
		return length * width;
	}
	
	

}