package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericEg1 {

	public static void main(String[] args) {
		List<String> obj=new ArrayList<String>();
		obj.add("Harsha");
		obj.add("Vivek");
		obj.add("Harsha");
		obj.add("Haridas");
		obj.add("Manjusha");
		System.out.println(obj);
		obj.set(3, "Vijayan");
		System.out.println(obj);
		System.out.println(obj.indexOf("Harsha"));
		System.out.println(obj.lastIndexOf("Harsha"));
		obj.remove(4);
		System.out.println(obj);
		obj.remove("Harsha");
		System.out.println(obj);
		System.out.println(obj.get(0));
		System.out.println(obj.contains("Harsha"));
		
		// TODO Auto-generated method stub

	}

}
