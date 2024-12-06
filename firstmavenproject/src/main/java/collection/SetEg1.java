package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEg1 {

	public static void main(String[] args) {
		Set<Integer> obj=new HashSet<Integer>();
		List<Integer> obj1=new ArrayList<Integer>();
		obj1.add(12);
		obj1.add(56);
		obj.add(1);
		obj.add(20);
		obj.add(40);
		obj.add(100);
		obj.add(50);
		System.out.println(obj);
		System.out.println(obj.contains(20));
		System.out.println(obj.addAll(obj1));
		System.out.println(obj);
		obj.removeAll(obj1);
		System.out.println(obj);
		// TODO Auto-generated method stub

	}

}
