package polymorphism;

public class PolyChildEg2 extends PolyParentEg2 {
	public void display()
	{
		System.out.println("Java");
		super.display();
	}

	public static void main(String[] args) {
		PolyChildEg2 obj=new PolyChildEg2();
		obj.display();
		// TODO Auto-generated method stub

	}

}
