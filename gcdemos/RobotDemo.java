package gcdemos;

public class RobotDemo {
	public void stayPositive(String name, String quote) {
		System.out.println("Hey " + name + "," + quote);
	}
	
	
	public static int getRobotAge(int age) {
		
		int roboAge = age * 6;
		return roboAge; //start with a null value to remove red warning high lighter, come back to it later
		//any code under a return is unusable; return is used to 'break' out of a method
	}
}
