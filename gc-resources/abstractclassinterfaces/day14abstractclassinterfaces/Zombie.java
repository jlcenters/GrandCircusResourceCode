package day14abstractclassinterfaces;

public class Zombie extends Human{	//concrete classes are finished
	public String getName() {
		return name;
	}
	public Zombie(String name) {
		super(name);	//super goes to top
	}
	public void stalk() {
		getName();
		System.out.println(" slowly chases...");
	}
	@Override
	public void attack(Character opponent) {
		System.out.println("takes a bite out of " + opponent.getName());
	}
}
