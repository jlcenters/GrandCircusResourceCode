package Week4;

import java.util.*;

public class AlgorithmPractice {

	public static void main(String[] args) {

	//SORT WITH LIST ARRAY
		List<Integer> unsorted = new ArrayList<>();
		unsorted.add(5);
		unsorted.add(7);
		unsorted.add(0);
		unsorted.add(1);
		unsorted.add(2);
		
		System.out.println("Unsorted: " + unsorted);
		System.out.println("Sorted: " + sortList(unsorted));
		
		
		
	//SORT WITH PRIMITIVE ARRAY
		int[] arr = {5,7,0,1,2};
		
		System.out.println("Unsorted: " + Arrays.toString(arr));
		System.out.println("Sorted: " + Arrays.toString(sortArray(arr)));

	}
	
	
	
	public static List<Integer> sortList(List<Integer> list){
		
		List<Integer> sorted = new ArrayList<>();
		
		while(!list.isEmpty()) {
			Integer min = list.get(0);
			for(int i = 0; i < list.size(); ++i) {
				if(list.get(i) < min) {
					min = list.get(i);
				}
			}
			
			sorted.add(min);
			list.remove(min);
			
		}
		
		return sorted;
		
	}
	
	
	
	public static int[] sortArray(int[] arr) {
		int length = arr.length;
	
	//INDEX @ 0 = INITIAL MINIMUM VALUE
		for(int i = 0; i < length - 1; ++i) {
			int index = i;
			for(int j = i+1; j < length; ++j) {
				if(arr[j] < arr[index]) {
					index = j;
					
				}
				
			}
			
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
			
		}
		
		return arr;
		
	}
	
	
	

}
