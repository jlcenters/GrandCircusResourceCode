package dice;

public class Person {

	private String name;
	String race;
	private int hp;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	public Person() {
		
	}
	public Person(String name,String race,int hp) {
		this.race = race;
		this.name = name;
		this.hp = hp;
	}
	
	
	
	public int takeDamage(int hp, int damage) {
		System.out.println(name + " cries out, \"Agh!\" and takes " + damage + " damage.\nCURRENT HP: " + (hp - damage));
		return hp -= damage;
	}
	/*s 10
	d 5
	i 5
	c 5
	e 7
	k 9 (90/100)
	SAIYAN; 410*/
	}
