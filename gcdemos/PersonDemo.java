package gcdemos;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {

			System.out.println(Person.getTears(1));		//calling a class to receive a method
			
			Person person1 = new Person();	//declaring an object; has default values
			//person1 = "Bob"; STRING TO PERSON
			
			//SETTERS; SET VALUES
			Person person2 = new Person("Garth",62);
			Person person3 = new Person("Reggie",24,2);		
			
			
			//GETTERS; GET VALUES
			String name = person3.getName();		//calls instance of the class, known as an OBJECT
			System.out.println(name);
			
			Person.greeting();
			
			System.out.println(person2.getNameTag());
			
			System.out.println(person2.toString());
			
			
			
			Scanner scnr = new Scanner(System.in);
			
			
			name = Validator.getString(scnr, "Enter a name: ");
			
			int age = Validator.getInt(scnr, "Enter an age: ", 1, 121);
			
			int userNum = Validator.getInt(scnr, "What's your lucky number? ", 0, 999999999);
			
			Person user = new Person(name,age,userNum);
			System.out.println(user);
			
			ArrayList<Person> arr = new ArrayList<>();
			
			int groupSize = Validator.getInt(scnr, "How many people are in your group? [3-10]",3,10);
			
			System.out.println(getNameTags(scnr,arr,groupSize));
			System.out.println("Goodbye!");
	}



	public static ArrayList<Person> getNameTags(Scanner scnr, ArrayList<Person> arr, int groupSize){
		String name = "";
		int age;
		int userNum;
		
		for(int i = 1; i <= groupSize; ++i) {
			System.out.print("What is person " + i + "'s name?");
			name = scnr.nextLine();
			System.out.print("\nWhat is their age?");
			age = scnr.nextInt();
			System.out.print("\nWhat is their lucky number?");
			userNum = scnr.nextInt();
			
			Person person = new Person(name, age,userNum);
			
			arr.add(person);
			scnr.nextLine();
		}
		return arr;
	}
	
	
}
