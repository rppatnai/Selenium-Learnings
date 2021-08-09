package collectiondemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		//Array
		String arr[] = {"Dog","Cat","Elephant","Deer","Tiger"};

		for(String value:arr)
		{
			System.out.println(value);
		}
		
		//Converting array in to arraylist object : Using of Arrays.asList(array);
		
		ArrayList al= new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		
	}

}
