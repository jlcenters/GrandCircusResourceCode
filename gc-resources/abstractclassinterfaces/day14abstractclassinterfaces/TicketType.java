package day14abstractclassinterfaces;

public enum TicketType {
	CHILD(3.50),ADULT(4.50),SENIOR(2.00);
	private double price;
	
	public double getPrice() {
		return price;
	}
	private TicketType(double price) {
		this.price = price;
	}
	
}
