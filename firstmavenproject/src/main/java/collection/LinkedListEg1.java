package collection;

import java.util.LinkedList;

public class LinkedListEg1 {

	public static void main(String[] args) {
		LinkedList<String> obj=new LinkedList<String>();
		LinkedList<String> obj1=new LinkedList<String>();
		obj.add("tea");
		obj.add("coffee");
		obj.add("peanut");
		obj1.add("dates");
		obj1.add("cashew");
		obj.addAll(obj1);
		System.out.println(obj);
		System.out.println(obj.contains("tea"));
		System.out.println(obj.get(3));
		System.out.println(obj.isEmpty());
		obj.remove("coffee");
		System.out.println(obj);
		System.out.println(obj.size());
		
		
		
		// TODO Auto-generated method stub

	}

}
