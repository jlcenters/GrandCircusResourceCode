package gcdemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;


/**
 * 
 * @author Jillian
 *
 */
class Box<T>{	
	T value;	//returns type T
	
	public void printSomething() {		//nonstatic; must contain an instance
		System.out.println("Generic!");	//can create methods within 
	}
}

public class CollectionsDemo {
	 
	
	public static void main(String[] args) {
		/*Box<Integer> myClass = new Box<>();
		myClass.value = 1000;		//must be the same type of the list if specified
		myClass.printSomething();
		System.out.println(myClass.value);
		
		myClass.add(0,450); //does not remove any prior elements, only adds bc collections are dynamic
		
		System.out.println("Amount: \n" + values.size()); //prints out the amount of elements
		
		System.out.println("All Elements: \n" + values); //there's already a .toString() method within the List class
		System.out.println("Element 3: \n" + values.get(3)); // gets element #3, 12 [STARTS AT 1]
		
		Collections.sort(values);		//perma change
		System.out.println("Sorted: \n" + values);
		
		
		int num = values.get(3);
		Integer numb = num;
		values.remove(numb);	//removes specific element
		System.out.println(values);
		values.remove(2);		//remove element @ indx
		System.out.println(values); */
		
		
		
	//HASH MAP
		Map<String,Double> items = new HashMap<>();
		
		items.put("Toaster",350.00);		//inits elements into map [STRING == KEY; DOUBLE == VALUE]
		items.put("Dongle", 5.99);
		items.put("Sham Wow", 19.99);
		items.put("Flex Seal",19.99);
		
		Set<String> setOKeys = items.keySet();
		int count = 0;
		for(String key : items.keySet()){
			System.out.print(++count + ") " + key + ": $" /*+ items.get(key)USED IN NORMAL FORMAT; NEEDED TO UPDATE FOR 2 DECI POINTS see below*/);
			System.out.printf("%.2f\n", items.get(key));	//printf; decimal format to help
			
		}
		
		System.out.println(items.containsKey("Sham Wow"));
		System.out.println(items.containsValue(19.99));
		
		
		
	//ANIMAL BOOK HASH MAP EXAMPLE
		Map<String, Integer> ani = new HashMap<>();
		ani.put("Toucan", 40);
		ani.put("Lizard", 7);			//Stored by Integer value
		ani.put("Wallaby", 18);
		
		System.out.println(ani.get("Lizard"));
		
		ani.remove("Toucan");
		
		System.out.println(ani); //toString Method is in the collections class automatically
		
		
		
	//TREE MAP
		Set<Character> letters = new TreeSet<>(); //LINKEDHASHSET will be unordered
		letters.add('b');
		letters.add('c');
		letters.add('a');
		letters.add('c');		//duplicate REMOVED automatically
		
		System.out.println(letters);
		
		letters.remove('b');
		System.out.println(letters);
		
		System.out.println(letters.contains('f'));
		
		
		
		LinkedList<String> food = new LinkedList<>(); //can do list-linked list, linked list-linked list
		
		food.add("Sauerkraut");
		food.add("Carrots");
		food.add("Mud");
		food.add(1, "Margarine"); //at indx 1; Margarine
		
		Collections.sort(food); //method in collections class which sorts
		food.toString();
		//food.clear(); clears list
		
		String marg = food.get(3);
		
		
		
		Queue<String> cities = new PriorityQueue<>();
		
		cities.offer("Detroit");		//QUEUES 'OFFER'
		cities.offer("Los Angeles");
		cities.offer("Vienna");
		cities.offer("Windsor");
		
		System.out.println(cities.peek()); //insertion order
		System.out.println(cities);
		
		Stack<String> dishes = new Stack<>();
		
		dishes.add("Cereal bowl");
		dishes.add("Lunch tray");
		dishes.add("Pots and pans");
		dishes.add("Dinner fork");
		
		System.out.println(dishes.peek());
		
		dishes.pop();
		dishes.pop();		//removing the oldest; fifo 
		
		System.out.println(dishes);
	}

}
