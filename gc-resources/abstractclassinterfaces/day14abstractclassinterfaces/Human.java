package day14abstractclassinterfaces;

public abstract class Human implements Character{	//abstract classes cannot be instantiated; objects cannot be created but inherited;
//abstract classes act as contracts for their children to adhere
	String name;

	public Human(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public abstract void attack(Character opponent);
}
 