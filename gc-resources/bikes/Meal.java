package co.grandcircus.bikes;

public class Meal{

	protected String title;
	protected Food[] dishes;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Food[] getDishes() {
		return dishes;
	}
	public void setDishes(Food[] dishes) {
		this.dishes = dishes;
	}
	
	public Meal(String title) {
		this.title = title;
		String[] kale = {"Vitamin A","Vitamin C"};
		dishes = new Food[3];
		dishes[0] = new Food("rice",123);
		dishes[1] = new Food("peaches",200);
		dishes[2] = new Veggie("kale",33,kale);
		
	}
	
	
	@Override
	public String toString() {
		return String.format("%s",getDishes());
	}
}
