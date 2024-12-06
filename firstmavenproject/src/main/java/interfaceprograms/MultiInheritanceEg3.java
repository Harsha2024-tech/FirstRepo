package interfaceprograms;

public class MultiInheritanceEg3 implements MultiInheritanceEg1,MultiIheritanceEg2 {

	public static void main(String[] args) {
		MultiInheritanceEg3 obj=new MultiInheritanceEg3();
		obj.add();
		obj.sub();
		// TODO Auto-generated method stub

	}

	@Override
	public void sub() {
		int a=30;
		int b=20;
		int c=a-b;
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}

}
