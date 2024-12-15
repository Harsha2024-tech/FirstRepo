package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String>obj=new ArrayList<String>();
		ArrayList<String>obj1=new ArrayList<String>();
		obj.add("red");
		obj.add("green");
		obj1.add("yellow");
		obj1.add("pink");
		obj.addAll(obj1);
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
		System.out.println(obj.get(1));
		System.out.println(obj.contains("green"));
		Iterator<String>it=obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// TODO Auto-generated method stub

	}

}
