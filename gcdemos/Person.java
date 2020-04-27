package gcdemos;




public class Person {	
	
	//INSTANCE VARIABLES(FIELDS OF CLASS/ATTRIBUTES)
	private String name = "";//to keep null from appearing		//specific instance
	private int age = 1;//default value
	private int luckyNum = 2;
	
	//CONSTANT
	public final static int EMOTIONAL_IQ = 2;	//belong to the class
	
	
	public static void greeting() {
		System.out.println("All you need is love.");
	}
	
	
	public static int getTears(int viewings) {
		
		
		return EMOTIONAL_IQ * viewings;
	}
	
	
	
	//EXAMPLE OF DEFAULT CONSTRUCTOR;COULD ALSO BE:
	//public Person(){}
	public Person() {	//matches class; is accessible globally
		//super();		//super class called
		this.name = null;
		this.age = 0; //this = this instance
		
	}
	
	
	//OVERLOADED CONSTRUCTOR
	public Person(String name,int age) {
		this.name = name;	//THIS method/instance
		this.age = age;
	}
	
	
	
	public Person(String name,int age,int luckyNum) {
		this.name = name;
		this.age = age;
		this.luckyNum = luckyNum;
	}
	
	
	//INSTANCE VALUES
	public void setName(String name) { //setter
		this.name = name; //with a different persona, using this. isn't necessary
	}
	public String getName() { //GETTER
		return name;
	}
	
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
	public void setLuckyNum(int luckyNum) {
		this.luckyNum = luckyNum;
	}
	
	public int getLuckyNum() {
		return luckyNum;
	}
	
	
	//getter using instance variables
	public String getNameTag() { //instance required to use variables in the methods
		return "Hi, my name is " + name + ". I am " + age + " years old.";
	}
	
	
	
	//OVERRIDING METHODS
	@Override  //not necessary but prevents confusion
	public String toString() {
		return String.format("Person[name: %s, age: %d, Lucky Number: %d]", name,age,luckyNum);
	}
	
	
	
	
}
