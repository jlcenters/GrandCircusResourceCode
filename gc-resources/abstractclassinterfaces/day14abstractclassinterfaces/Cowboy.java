package day14abstractclassinterfaces;

public class Cowboy extends Human{
	public String getName() {
		return name;
	}

	public Cowboy(String name) {
		super(name);
	}
	public void greets() {
		getName();
		System.out.println(" tips his hat. \"Howdy Pardner.\"");
	}

	@Override
	public void attack(Character opponent) {

		System.out.println("fires his gun at " + opponent.getName());
	}
}
