package polymorphism;

public class PolyChildEg1 extends PolyParentEg1 {
	public void add(int a,int b)
	{
		super.add(50, 60);
		int c=a-b;
		System.out.println("Substraction Result:" +c);
	}

	public static void main(String[] args) {
		PolyChildEg1 obj=new PolyChildEg1();
		obj.add(100, 20);
		// TODO Auto-generated method stub

	}

}
