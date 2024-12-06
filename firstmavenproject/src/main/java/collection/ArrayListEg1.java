package collection;

import java.util.ArrayList;

public class ArrayListEg1 {

	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Apple");
		obj.add("orange");
		obj.add("Grape");
		obj.add("pineapple");
		obj.add("guvava");
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("red");
		obj1.add("yellow");
		obj.addAll(obj1);
		System.out.println(obj);
		System.out.println(obj.contains("red"));
		System.out.println(obj.get(1));
		System.out.println(obj.isEmpty());
		obj.remove(2);
		System.out.println(obj);
		System.out.println(obj.size());
		
		// TODO Auto-generated method stub

	}

}
