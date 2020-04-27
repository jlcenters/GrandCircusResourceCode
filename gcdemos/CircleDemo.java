package gcdemos;

public class CircleDemo {

	public static void main(String[] args) {
		Circle circ = new Circle(2.5);
		System.out.println("CIRCLE (radius: "+ circ.toString() + ")");
		System.out.println("AREA: " + circ.areaCalc());
		
		System.out.println("CIRCUMFERENCE: " + circ.circumCalc());
	}

}
