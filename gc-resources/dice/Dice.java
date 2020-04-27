package dice;

import java.util.*;

public class Dice {

	private int sides;

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}
	
	public Dice(int sides) {
		this.sides = sides;
	}
	public Dice() {
		
	}
	
	public static void roll(Dice die, int rollNum) {
		int sides = die.getSides();
		Random ran = new Random();
		for(int i = 0; i < rollNum; ++i) {
			System.out.println(ran.nextInt(sides) + 1);
		} 
	}
}
