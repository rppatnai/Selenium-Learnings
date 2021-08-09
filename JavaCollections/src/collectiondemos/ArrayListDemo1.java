package collectiondemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		
		//Declare ArrayList - Heterogeneous Elements
		ArrayList al = new ArrayList();
		
		//Declare ArrayList - Homogeneous Elements
		ArrayList <Integer> bl = new ArrayList<Integer>();
		ArrayList <String> cl = new ArrayList<String>();
		
		//List is parent Interface of Arraylist so we can also make an ArrayList Using List
		List dl=new ArrayList();
		
		
		
		//Add New elements to arraylist
		al.add(50);
		al.add("Rohan");
		al.add("True");
		al.add('A');
		al.add(true);
		System.out.println("Number of elements from ArrayList="+al);
		
		//Find size of array List
		System.out.println("Number of elements in array List="+al.size());
		
		
		//Remove Elements from array List 
		al.remove(1); // Rohan is removed
		System.out.println("Removed the selected in array List="+al);
		
		//Adding element in the middle of array List
		al.add(3, "Roshan");
		System.out.println("Added element in the middle of array List=" + al); 
		
		//retrieve specific element
		System.out.println(al.get(2));
		
		//change/replace existing value- set method
		al.set(3, "Kalpana");
		System.out.println(al);
		
		//search a value in the array list
		System.out.println(al.contains("Kalpana")); // true
		System.out.println(al.contains("Sneha")); //false
		
		//to check if the array list is empty or not
		System.out.println(al.isEmpty()); //false
		
		
		//To read the data from arrayList
		//1st Approach - For loop
		System.out.println("Reading Elements using 'FOR' loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	
		//2nd Approach - For each loop
		System.out.println("Reading Elements using 'FOR EACH' loop");
		for (Object e:al)
		{
			System.out.println(e);
		}
		
		//3rd Approach - Iterator
		System.out.println("Reading Elements using 'Iterator' Method");
		
		Iterator it =al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()); // printing the element and will automatically move to the next element
		}
		
		
	}

}
