package gcdemos;

public class RectangleChallenge {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(10.0,5.0);
		Rectangle rec2 = new Rectangle(25.5,18.2);
		
		System.out.print("Rectangle 1: ");
		System.out.print(rec1.toString());
		System.out.print(" Area: " + rec1.calcArea(10.0,5.0));
		System.out.println(" Perimeter: " + rec2.calcPerimeter(10.0,5.0));
		System.out.print("Rectangle 2: ");
		System.out.print(rec2.toString());
		System.out.printf("%s,%.2f"," Area: ", rec2.calcArea(25.5,18.2));
		System.out.printf("%s,%.2f"," Perimeter: ", rec2.calcPerimeter(25.5,18.2));
		
	}

}
