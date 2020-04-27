package dice;

public class Game {

	public static void main(String[] args) {

		Person jill = new Person("Soybean","Saiyan",70);
		Person evee = new Person("Caulk","Namekian",70);
		
		Dice four = new Dice(4);
		Dice six = new Dice(6);
		Dice eight = new Dice(8);
		Dice ten = new Dice(10);
		Dice twelve = new Dice(12);
		Dice twenty = new Dice(20);
		//MAKE A VALIDATOR = DICE.GETDICE AND SO ROLL DICE IS INT INT INSTEAD OF DICE INT
		
		Dice.roll(four, 1);
		jill.takeDamage(5, 24);
		evee.takeDamage(2,3);
	}

}
