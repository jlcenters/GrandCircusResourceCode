package co.grandcircus.bikes;

public class Food {

	private String name;
	private int calories;

	public Food(String name, int calories) {
		super();
		this.name = name;
		this.calories = calories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", calories=" + calories + "]";
	}

}