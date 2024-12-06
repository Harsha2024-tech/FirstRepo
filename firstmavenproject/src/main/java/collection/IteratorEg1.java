package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEg1 {

	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("car");
		obj.add("bike");
		obj.add("television");
		obj.add("phone");
		obj.add("laptop");
		Iterator<String> it= obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(obj);
		
		
		// TODO Auto-generated method stub

	}

}
