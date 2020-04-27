package day14abstractclassinterfaces;

public class BattleRoyale {

	public static void main(String[] args) {
		
		Zombie niceZombie = new Zombie("Tom");	//CAN SAY HUMAN ISA NEW ZOMBIE()
		System.out.println(niceZombie.stalk());
		Human meanCowboy = new Cowboy("Mark");
		
		
		
		System.out.print(meanCowboy.getName() + " ");
		meanCowboy.attack(niceZombie);
		
		Zombie meanZombie = new Zombie("Richard");
		meanZombie.stalk();
		Human niceCowboy = new Cowboy("Gregory");
		
		
		
		System.out.print(meanZombie.getName() + " ");
		meanZombie.attack(niceCowboy);
		
		
		
		
	}

}
