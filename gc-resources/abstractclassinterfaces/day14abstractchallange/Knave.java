package day14abstractchallange;

public class Knave extends Islander{

	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Knave(String name) {
		this.name = name;
	}
	
	@Override
	boolean isAKnight() {
		return false;
	}

	@Override
	boolean isAKnave() {	
		return true;
	}

	@Override
	boolean isTellsTruth() {
		return false;
	}

}
