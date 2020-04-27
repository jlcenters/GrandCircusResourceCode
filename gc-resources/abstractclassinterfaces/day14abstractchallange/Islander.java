package day14abstractchallange;

public abstract class Islander {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	abstract boolean isAKnight();
	abstract boolean isAKnave();
	abstract boolean isTellsTruth();
}
