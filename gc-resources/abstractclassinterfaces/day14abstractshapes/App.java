package day14abstractshapes;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		
		Circle circ1 = new Circle();
		circ1.setRadius(2.5);
		Circle circ2 = new Circle();
		circ2.setRadius(5.8);
		Circle circ3 = new Circle();
		circ3.setRadius(15.0);
		
		Rectangle rec1 = new Rectangle();
		rec1.setPerimeters(15.5, 8.75);
		Rectangle rec2 = new Rectangle();
		rec2.setPerimeters(8, 12.8);
		Rectangle rec3 = new Rectangle();
		rec3.setPerimeters(20, 15);
		
		Triangle tri1 = new Triangle();
		tri1.setPerimeters(14.5, 8);
		Triangle tri2 = new Triangle();
		tri2.setPerimeters(3, 10.7);
		Triangle tri3 = new Triangle();
		tri3.setPerimeters(20.5, 4);
		
		shapes.add(rec1);
		shapes.add(rec2);
		shapes.add(rec3);
		shapes.add(circ1);
		shapes.add(circ2);
		shapes.add(circ3);
		shapes.add(tri1);
		shapes.add(tri2);
		shapes.add(tri3);

		double maxArea = 0.0;
		
		Shape maxShape = new Circle();
		for(Shape shape : shapes) {
			if(shape.calcArea() > maxArea) {
				maxArea = shape.calcArea();
				maxShape = shape;
			}
		}
		
		
		
		System.out.printf("Max Area: %-5.2f", maxArea);
		System.out.println("\nMax Shape: " + maxShape);
		
		
		
	}
}
