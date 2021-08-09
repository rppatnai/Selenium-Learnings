package collectiondemos;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList(); 
		
		al.add("X");
		al.add("B");
		al.add("A");
		al.add("D");
		al.add("F");
		al.add("E");
		al.add("C");
		
		//copy one complete arraylist to a new collection array list
		ArrayList dup_al=new ArrayList();
		
		dup_al.addAll(al);
		System.out.println(dup_al); // [X, B, A, D, F, E, C]
		
		dup_al.removeAll(al);
		System.out.println("After removing="+dup_al);
		
		
		//Methods that come from collections Class
		//Sort an array List - collections.sort(list);
		System.out.println("Elements in the arraylist="+al); // [X, B, A, D, F, E, C]
		
		Collections.sort(al);
		System.out.println("Elements in the arraylist after sorting="+al);
		
		//Sort the array list in reverse order - collections.sort(list,collections.reverseorder());
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Elements in the arraylist after reversing="+al);
		
		//for shuffling
		Collections.shuffle(al);
		System.out.println("Elements in the arraylist after shuffling="+al);
		
		
		
	}

}
