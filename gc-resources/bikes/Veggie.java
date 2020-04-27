package co.grandcircus.bikes;

import java.util.Arrays;

public class Veggie extends Food{
	
	private String[] nutrients;
	
	public void setNutrients(String[] nutrients) {
		this.nutrients = nutrients;
	}
	public String[] getNutrients() {
		return nutrients;
	}
	
	public Veggie(String name, int calories, String[] nutrients) {
		super(name, calories);
		this.nutrients = nutrients;
	}
	
	@Override
	public String toString() {
		return String.format("Veggie:[name: %s; calories: %d; nutrients: %s]", getName(),getCalories(),Arrays.toString(nutrients));
	}
	
	
	
}
