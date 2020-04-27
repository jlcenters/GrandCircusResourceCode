package day14abstractchallange;

public class Knight extends Islander{

	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Knight(String name) {
		this.name = name;
	}
	@Override
	boolean isAKnight() {
		return true;
	}

	@Override
	boolean isAKnave() {
		return false;
	}

	@Override
	boolean isTellsTruth() {
		return true;
	}

}
