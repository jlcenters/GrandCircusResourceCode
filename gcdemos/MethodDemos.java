 package gcdemos;
/*
 * @author jilliancenters
 */
public class MethodDemos {
	public static void main(String[] args) {	
		
//greeting() is not static
		MethodDemos m = new MethodDemos();
		m.greeting();
		
//both methods are static
		staticGreeting();
		String name = "Fletcher";
		staticGreeting(" Roberta" + " " + name);
		staticGreeting(name, "Donna");
		
//importing a method from another class
		int myNewAge = RobotDemo.getRobotAge(21);
		System.out.println(myNewAge);
		RobotDemo robbie = new RobotDemo(); //all classes have a default constructor; void, can't be assigned to anything
		robbie.stayPositive("Jill ", "Do or do not, there is no try.");
		
		
		
	}
	public static void staticGreeting() { //no parameters
		
		System.out.println("Hello");
		
	}
	public void greeting() {
		
		System.out.println("Hello");

	}
//overloaded methods' PERSONAS (can add any object/type to parameter)
	public static void staticGreeting(String s) { //parameters of method changed
		
		System.out.println("Hello" + s); //parameters of sysout changed
	}
	public static void staticGreeting(String name1, String name2) {
		System.out.println("Hello " + name1 + " and " + name2);
	}
}
