package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEg1 {

	public static void main(String[] args) {
		List<String>obj=new ArrayList<String>();
		obj.add("red");
		obj.add("orange");
		obj.add("green");
		System.out.println(obj);
		obj.set(2, "red");
		System.out.println(obj);
		System.out.println(obj.indexOf("red"));
		System.out.println(obj.lastIndexOf("red"));
		obj.remove(2);
		System.out.println(obj);
		System.out.println(obj.get(0));
		System.out.println(obj.contains("red"));
		
		// TODO Auto-generated method stub

	}

}
