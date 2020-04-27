  package day14abstractclassinterfaces;

public class EnumDemo {
	
	public static void main(String[] args) {
		
		Signal woodward = Signal.YELLOW;
		woodward = Signal.GREEN;
		
		if(woodward == Signal.YELLOW) {
			System.out.println("Yield");
		}else if(woodward == Signal.RED) {
			System.out.println("Stop");
		}else if(woodward == Signal.GREEN) {
			System.out.println("Go");
		}
		
		System.out.println("\nSuddenly, you're seeing red and blue lights behind you.\n");
		TicketType ticket = TicketType.ADULT;
		System.out.print("You were charged ");
		System.out.printf("%s%.2f", "$",ticket.getPrice());
		System.out.println(" for speeding.");
	}
}
