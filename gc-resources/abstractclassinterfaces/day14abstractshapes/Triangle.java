package day14abstractshapes;

public class Triangle implements Shape{

	 private double height;
	 private double base;
	 
	  
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	public void setPerimeters(double base,double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double calcArea() {
		return (base * height)/2;
	}

	
}
