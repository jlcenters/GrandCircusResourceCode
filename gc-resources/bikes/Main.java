package co.grandcircus.bikes;

public class Main {

	public static void main(String[] args) {
		Meal dinner = new Meal("Dinner");
		Food[] dishes = dinner.getDishes();
		for(Food dish : dishes) {
			
			System.out.println(dish);
		}
	}

}
